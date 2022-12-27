package com.digipay.controller;

import com.digipay.model.entity.ElectricalProduct;
import com.digipay.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electrical")
public class ElectricalControllerImpl extends BaseControllerImpl<ElectricalProduct> implements ElectricalController {

    @Autowired
    private BaseService<ElectricalProduct> baseService;

    @Autowired
    private AccessController accessController;

    private Boolean accessFlag = false;

    @PutMapping("/update/{id}")
    @Override
    public String update(@PathVariable Integer id, @RequestBody ElectricalProduct electricalProductNew
            , @RequestParam String userNationalID) {
        accessFlag = accessController.checkAccess(userNationalID, "update");
        if (accessFlag) {
            ElectricalProduct electricalProductFetched = baseService.listByID(id);
            baseService.update(electricalProductNew, electricalProductFetched);
            return "Product updated!";
        } else {
            throw new RuntimeException();
        }
    }
}