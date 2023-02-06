package com.digipay.controller;

import com.digipay.model.entity.ElectricalProduct;
import org.springframework.http.HttpHeaders;

public interface ElectricalController extends BaseController<ElectricalProduct>{

    public String update(Integer id, ElectricalProduct electricalProduct, HttpHeaders headers);

}
