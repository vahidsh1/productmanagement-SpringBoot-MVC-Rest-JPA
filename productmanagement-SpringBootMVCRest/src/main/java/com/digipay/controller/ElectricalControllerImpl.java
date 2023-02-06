package com.digipay.controller;

import com.digipay.model.entity.DigitalProduct;
import com.digipay.model.entity.ElectricalProduct;
import com.digipay.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/electrical")
//public class ElectricalControllerImpl extends BaseControllerImpl<ElectricalProduct> implements ElectricalController {
public class ElectricalControllerImpl extends BaseControllerImpl<ElectricalProduct> implements ElectricalController {
    @Autowired
    private BaseService<ElectricalProduct> baseService;
    @PutMapping("/{id}")
    @Override
    public String update(@PathVariable Integer id, @RequestBody ElectricalProduct electricalProductNew
            , @RequestHeader HttpHeaders headers) {
            ElectricalProduct electricalProductFetched = baseService.listByID(id);
            baseService.update(electricalProductNew, electricalProductFetched);
            return "Product updated!";
    }
}