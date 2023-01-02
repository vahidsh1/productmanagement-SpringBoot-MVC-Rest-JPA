package com.digipay.service;


import com.digipay.model.entity.Store;

public interface StoreService extends BaseService<Store>{
        public void add(int productCount);
        public void remove(int productCount);

}

