package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Seller;

import java.util.Set;

public interface SellerService {

    Seller findByFirstName(String firstName);

    Seller findById(Long id);

    Seller save(Seller seller);

    Set<Seller> findAll();
}
