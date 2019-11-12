package guru.springframework.flowishshop.services;

import guru.springframework.flowishshop.model.Buyer;

import java.util.Set;

public interface BuyerService {
    Buyer findByLastName(String lastName);

    Buyer findById(Long id);

    Buyer save(Buyer buyer);

    Set<Buyer> findAll();
}
