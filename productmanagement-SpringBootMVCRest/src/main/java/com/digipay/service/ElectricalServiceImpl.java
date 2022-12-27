package com.digipay.service;

import com.digipay.model.entity.ElectricalProduct;
import com.digipay.repository.ElectricalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricalServiceImpl extends BaseServiceImpl<ElectricalProduct> implements ElectricalService{

    @Autowired
    protected ElectricalRepository electricalRepository;

    public ElectricalServiceImpl(ElectricalRepository electricalRepository) {
        this.electricalRepository = electricalRepository;
    }

    public ElectricalServiceImpl() {

    }

    @Override
    public void update(ElectricalProduct electricalProductNew, ElectricalProduct electricalProductFetched) {
        electricalProductFetched.setBrand(electricalProductNew.getBrand());
        electricalProductFetched.setEnergyRate(electricalProductNew.getEnergyRate());
        electricalProductFetched.setPowerUsage(electricalProductNew.getPowerUsage());
        electricalProductFetched.setPrice(electricalProductNew.getPrice());
        electricalProductFetched.setUserNationalID(electricalProductNew.getUserNationalID());
        electricalRepository.save(electricalProductFetched);
    }
}
