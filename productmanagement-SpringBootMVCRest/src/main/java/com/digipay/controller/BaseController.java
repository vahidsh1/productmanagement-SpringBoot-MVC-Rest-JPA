package com.digipay.controller;

import org.springframework.http.HttpHeaders;

import java.util.List;

public interface BaseController<T> {
    List<T> list(HttpHeaders headers);
    String create(T t, HttpHeaders headers);
    String delete(Integer id,  HttpHeaders headers);
    String update(Integer id, T t, HttpHeaders headers);

}