package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Order;

import java.util.Set;

public interface OrderService {

    Order findById(Long id);

    Order save(Order order);

    Set<Order> findAll();
}
