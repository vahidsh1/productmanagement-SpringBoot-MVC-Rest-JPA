package com.digipay.controller;

import com.digipay.service.BaseService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class BaseControllerImpl <T> implements BaseController<T> {
    @Autowired
    HttpServletRequest httpServletRequest;
    @Autowired
    private BaseService<T> baseService;
    @Override
    public void add(int productCount) {
    }
    @Override
    public void remove(int productCount) {
    }
    @GetMapping("/")
    @Override
    public List<T> list(@RequestHeader HttpHeaders headers) {
//        userNationalID=httpServletRequest.getHeader("userNationalID");
            List<T> t = baseService.listAll();
            return t;
    }
    @PostMapping("/")
    @Override
    public String create(@RequestBody T t, @RequestHeader HttpHeaders headers) {
            baseService.create(t);
            return "Store saved!";
    }
    @DeleteMapping("/{id}")
    @Override
    public String delete( @PathVariable Integer id,@RequestHeader HttpHeaders headers) {
            baseService.delete(id);
            return "Store deleted!";
    }
}
