package com.digipay.service;

import com.digipay.model.entity.Store;
import com.digipay.repositiry.StoreRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StoreServiceImpl extends BaseServiceImpl<Store> implements StoreService {

    @Autowired
    protected StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public StoreServiceImpl() {

    }

    @Override
    public void update(Store storeNew, Store storeFetched) {
        //todo:
    }
    @Override
    public void add(int productCount) {
        Store storeFetched = storeRepository.findById(1).orElseThrow(()-> new EntityNotFoundException());
        int stockCount=storeFetched.getStockCount();
        stockCount = stockCount+productCount;
        storeFetched.setStockCount(stockCount);
        storeRepository.save(storeFetched);

    }
    @Override
    public void remove(int productCount) {
        Store storeFetched = storeRepository.findById(1).orElseThrow(()-> new EntityNotFoundException());
        int stockCount=storeFetched.getStockCount();
        stockCount = stockCount-productCount;
        storeFetched.setStockCount(stockCount);
        storeRepository.save(storeFetched);
    }

}
