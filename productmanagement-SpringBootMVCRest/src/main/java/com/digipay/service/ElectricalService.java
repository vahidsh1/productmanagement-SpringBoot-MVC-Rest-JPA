package com.digipay.service;

import com.digipay.model.entity.ElectricalProduct;

public interface ElectricalService extends BaseService<ElectricalProduct>{
    public void update(ElectricalProduct electricalProduct, ElectricalProduct electricalProductFetched);

}
