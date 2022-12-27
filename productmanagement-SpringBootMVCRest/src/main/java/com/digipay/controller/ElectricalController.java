package com.digipay.controller;

import com.digipay.model.entity.ElectricalProduct;

public interface ElectricalController extends BaseController<ElectricalProduct>{

    public String update(Integer id, ElectricalProduct electricalProduct,String userNationalID);

}
