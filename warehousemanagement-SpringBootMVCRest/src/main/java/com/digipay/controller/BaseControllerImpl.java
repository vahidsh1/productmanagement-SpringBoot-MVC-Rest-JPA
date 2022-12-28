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
//    @Autowired
//    private AccessController accessController;
    @Autowired
    private BaseService<T> baseService;
    String userNationalID;
//    Boolean accessFlag=false;
    @GetMapping("/")
    @Override
    public List<T> list(@RequestHeader HttpHeaders headers) {
        userNationalID=httpServletRequest.getHeader("userNationalID");
//        accessFlag = accessController.checkAccess(userNationalID, "list");
//        if (accessFlag) {
            List<T> t = baseService.listAll();
            return t;
//        } else {
//            throw new RuntimeException();
//        }
    }

    @PostMapping("/")
    @Override
    public String create(@RequestBody T t, @RequestHeader HttpHeaders headers) {
        userNationalID=httpServletRequest.getHeader("userNationalID");
//        accessFlag = accessController.checkAccess(userNationalID, "create");
//        if (accessFlag) {
            baseService.create(t);
            return "The product saved!";
//        } else {
//            throw new RuntimeException();
//        }
    }


    @DeleteMapping("/{id}")
    @Override
    public String delete( @PathVariable Integer id,@RequestHeader HttpHeaders headers) {
        userNationalID = httpServletRequest.getHeader("userNationalID");
//        accessFlag = accessController.checkAccess(userNationalID, "delete");
//        if (accessFlag) {
            baseService.delete(id);
            return "Product deleted!";
//        } else {
//            throw new RuntimeException();
//        }
    }
    @Override
    public String update(Integer id,  T t, HttpHeaders headers) {
        return "Store updated!";
    }

}
