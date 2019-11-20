package guru.springframework.flowishshop.services.map;

import guru.springframework.flowishshop.model.Buyer;
import guru.springframework.flowishshop.services.CrudService;

import java.util.Set;

public class BuyerServiceMap extends AbstractMapService<Buyer, Long> implements CrudService<Buyer, Long> {

    @Override
    public Set<Buyer> findAll() {
        return this.findAll();
    }

    @Override
    public Buyer findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Buyer save(Buyer object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Buyer object) {
       super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
     super.findById(id);

    }
}
