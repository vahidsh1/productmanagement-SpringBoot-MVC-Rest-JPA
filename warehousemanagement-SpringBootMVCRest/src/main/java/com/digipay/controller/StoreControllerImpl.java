package com.digipay.controller;

import com.digipay.model.entity.Store;
import com.digipay.repositiry.StoreRepository;
import com.digipay.service.BaseService;
import com.digipay.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreControllerImpl extends BaseControllerImpl<Store> {
    @Autowired
    private StoreService storeService;

    @Override
    @GetMapping("/add")
    public void add(@RequestHeader("productCount") int productCount) {

        storeService.add(productCount);
    }
    @Override
    @GetMapping("/remove")
    public void remove(@RequestHeader("productCount") int productCount) {
        storeService.remove(productCount);

    }
}
