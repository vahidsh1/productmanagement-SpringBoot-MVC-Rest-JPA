package com.digipay.repository;

import com.digipay.model.entity.DigitalProduct;
import com.digipay.model.entity.ElectricalProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricalRepository extends BaseRepository<ElectricalProduct> {
}
