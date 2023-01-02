package com.digipay.controller;

import com.digipay.model.entity.Store;
import org.springframework.http.HttpHeaders;

public interface StoreController  extends BaseController<Store> {

    public void add(int productCount);
    public void remove(int productCount);

}
