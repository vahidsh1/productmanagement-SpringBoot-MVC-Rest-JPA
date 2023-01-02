package com.digipay.controller;

import org.springframework.http.HttpHeaders;

import java.util.List;

public interface BaseController<T> {

    void add(int productCount);
    void remove(int productCount);
    List<T> list(HttpHeaders headers);

    String create(T t, HttpHeaders headers);

    String delete(Integer id, HttpHeaders headers);
}

