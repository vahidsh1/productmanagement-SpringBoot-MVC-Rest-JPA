package com.digipay.repository;
import com.digipay.model.entity.Customer;
import com.digipay.model.entity.Order;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderRepository extends BaseRepository<Order>{
//    public List<Order> listOrdersByCustomerID(@Param("PMCID") int CID);
    public List<Order> findByCustomer(Customer customer);
}