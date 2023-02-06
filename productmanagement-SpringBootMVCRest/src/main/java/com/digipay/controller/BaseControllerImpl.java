package com.digipay.controller;
import com.digipay.service.BaseService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//public class BaseControllerImpl<T> implements BaseController<T> {
public abstract class BaseControllerImpl<T> implements BaseController<T> {
    @Autowired
    HttpServletRequest httpServletRequest;
    @Autowired
    private BaseService<T> baseService;
    String userNationalID;
    @GetMapping("/")
    @Override
    public List<T> list(@RequestHeader HttpHeaders headers) {
            List<T> t = baseService.listAll();
            return t;
    }
    @PostMapping("/")
    @Override
    public String create(@RequestBody T t, @RequestHeader HttpHeaders headers) {
            baseService.create(t);
            return "The product saved!";
    }
    @DeleteMapping("/{id}")
    @Override
    public String delete( @PathVariable Integer id,@RequestHeader HttpHeaders headers) {
            baseService.delete(id);
            return "Product deleted!";
    }
}