package com.digipay.controller;

import com.digipay.model.entity.Store;
import com.digipay.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreControllerImpl  extends BaseControllerImpl<Store> {

    @Autowired
    private BaseService<Store> baseService;

//    @Autowired
//    private AccessController accessController;

//    private Boolean accessFlag=false;
    @PutMapping("/{id}")
    @Override
    public String update(@PathVariable Integer id, @RequestBody Store store
            , @RequestHeader HttpHeaders headers) {
//        userNationalID=httpServletRequest.getHeader("userNationalID");
//        accessFlag = accessController.checkAccess(userNationalID, "update");
        if (accessFlag) {
            Store storeFetched = baseService.listByID(id);
            baseService.update(store, storeFetched);
            return "Store updated!";
        }else {
            throw new RuntimeException();
        }
    }
}
