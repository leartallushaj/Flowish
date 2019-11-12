package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Seller;

import java.util.Set;

public interface SellerService extends CrudService<Seller,Long> {

    Seller findByFirstName(String firstName);

    @Override
    default Set<Seller> findAll() {
        return null;
    }

    @Override
    default Seller findById(Long aLong) {
        return null;
    }

    @Override
    default Seller save(Seller object) {
        return null;
    }

    @Override
    default void delete(Seller object) {

    }

    @Override
    default void deleteById(Long aLong) {

    }
}
