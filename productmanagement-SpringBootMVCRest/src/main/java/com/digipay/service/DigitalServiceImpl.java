package com.digipay.service;

import com.digipay.model.entity.DigitalProduct;
//import com.digipay.model.entity.Student;
import com.digipay.repository.DigitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DigitalServiceImpl extends BaseServiceImpl<DigitalProduct> implements DigitalService {
    @Autowired
    protected DigitalRepository digitalRepository;

    public DigitalServiceImpl(DigitalRepository digitalRepository) {
        this.digitalRepository = digitalRepository;
    }

    public DigitalServiceImpl() {

    }

//    @Override
//    public DigitalProduct listByID(int id) {
//        Student student = new Student();
//        Optional.empty();
//        Optional.ofNullable(student);
//        Optional<Student> student1 = Optional.of(student);
//        Optional<DigitalProduct> productOptional = digitalRepository.findById(id);
//        boolean present = productOptional.isPresent();
////        if (present)
//            return productOptional.get();
////        productOptional.ifPresent();
//    }

    @Override
    public void update(DigitalProduct digitalProductNew, DigitalProduct digitalProductFetched) {
        digitalProductFetched.setRam(digitalProductNew.getRam());
        digitalProductFetched.setPrice(digitalProductNew.getPrice());
        digitalProductFetched.setBrand(digitalProductNew.getBrand());
        digitalProductFetched.setCpuModel(digitalProductNew.getCpuModel());
        digitalProductFetched.setUserNationalID(digitalProductNew.getUserNationalID());
        digitalRepository.save(digitalProductFetched);
    }
}
