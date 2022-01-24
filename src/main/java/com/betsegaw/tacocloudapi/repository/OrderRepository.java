package com.betsegaw.tacocloudapi.repository;

import java.util.List;

import com.betsegaw.tacocloudapi.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
