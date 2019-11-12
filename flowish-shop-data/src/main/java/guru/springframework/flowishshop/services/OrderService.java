package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Order;

import java.util.Set;

public interface OrderService extends CrudService<Order,Long>{

    @Override
    default Set<Order> findAll() {
        return null;
    }

    @Override
    default Order findById(Long aLong) {
        return null;
    }

    @Override
    default Order save(Order object) {
        return null;
    }

    @Override
    default void delete(Order object) {

    }

    @Override
    default void deleteById(Long aLong) {

    }
}
