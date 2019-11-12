package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Buyer;

import java.util.Set;

public interface BuyerService extends CrudService<Buyer, Long> {
    Buyer findByLastName(String lastName);

    @Override
    default Set<Buyer> findAll() {
        return null;
    }

    @Override
    default Buyer findById(Long aLong) {
        return null;
    }

    @Override
    default Buyer save(Buyer object) {
        return null;
    }

    @Override
    default void delete(Buyer object) {

    }

    @Override
    default void deleteById(Long aLong) {

    }
}
