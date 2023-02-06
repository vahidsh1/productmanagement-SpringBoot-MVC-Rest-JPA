package com.digipay.controller;

import com.digipay.model.entity.DigitalProduct;
import com.digipay.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digital")
public class DigitalControllerImpl extends BaseControllerImpl<DigitalProduct> implements DigitalController {
    @Autowired
    private BaseService<DigitalProduct> baseService;
    @PutMapping("/{id}")
    @Override
    public String update(@PathVariable Integer id, @RequestBody DigitalProduct digitalProduct
    ,@RequestHeader HttpHeaders headers) {
            DigitalProduct digitalProductFetched = baseService.listByID(id);
            baseService.update(digitalProduct, digitalProductFetched);
            return "Product updated!";
    }
}
