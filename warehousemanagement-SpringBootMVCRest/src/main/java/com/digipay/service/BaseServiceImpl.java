package com.digipay.service;

import com.digipay.repositiry.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    protected BaseRepository<T> baseRepository;

    public BaseServiceImpl(BaseRepository<T> baseRepository) {

        this.baseRepository = baseRepository;
    }

    public BaseServiceImpl() {

    }

    @Override
    public void create(T Entity) {

        baseRepository.save(Entity);
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
    }

    @Override
    public void update(T EntityNew, T EntityFetched) {

    }
    @Override
    public void add(int productCount) {

    }
    @Override
    public void remove(int productCount) {

    }
}
