package com.digipay.service;

import com.digipay.repository.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected BaseRepository<T> baseRepository;
    @Autowired
    private WarehouseService warehouseService;

    public BaseServiceImpl(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    public BaseServiceImpl() {
    }

    @Override
    public void create(T Entity) {
        baseRepository.save(Entity);
        warehouseService.increaseStockWareHouse();
    }

    public T listByID(int id) {

        return baseRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public List<T> listAll() {
        return baseRepository.findAll();
    }

    @Override
    public void delete(int id) {
        baseRepository.deleteById(id);
        warehouseService.decreaseStockWareHouse();
    }

    @Override
    public void update(T EntityNew, T EntityFetched) {
    }
}
