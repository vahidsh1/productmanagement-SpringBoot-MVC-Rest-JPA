package com.digipay.service;

import java.util.List;

public interface BaseService<T> {
    public void create(T Entity);

    public T listByID(int id);

    public List<T> listAll();

    public void update(T EntityNew, T EntityFetched);

    public void delete(int id);

    public void add(int productCount);
    public void remove(int productCount);

}