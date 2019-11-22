package guru.springframework.flowishshop.services.map;

import guru.springframework.flowishshop.model.Buyer;
import guru.springframework.flowishshop.services.BuyerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BuyerServiceMap extends AbstractMapService<Buyer, Long> implements BuyerService {

    @Override
    public Buyer findByLastName(String lastName) {
        return null;
    }

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
     super.deleteById(id);

    }
}
