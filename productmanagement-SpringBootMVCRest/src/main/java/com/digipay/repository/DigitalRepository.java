package com.digipay.repository;

import com.digipay.model.entity.DigitalProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalRepository extends BaseRepository<DigitalProduct> {
}

