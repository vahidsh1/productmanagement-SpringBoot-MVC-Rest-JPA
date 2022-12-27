package com.digipay.controller;

import com.digipay.model.entity.DigitalProduct;
import org.springframework.http.HttpHeaders;

public interface DigitalController extends BaseController<DigitalProduct> {

    public String update(Integer id, DigitalProduct digitalProduct, HttpHeaders headers);

}
