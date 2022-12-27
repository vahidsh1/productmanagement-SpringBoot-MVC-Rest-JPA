package com.digipay.service;

import com.digipay.model.entity.DigitalProduct;
public interface DigitalService extends BaseService<DigitalProduct> {

    public void update(DigitalProduct digitalProductOld, DigitalProduct digitalProductFetched);
}
