package guru.springframework.flowishshop.services.map;

import guru.springframework.flowishshop.model.Seller;
import guru.springframework.flowishshop.services.SellerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SellerServiceMap extends AbstractMapService<Seller, Long> implements SellerService {

    @Override
    public Seller findByFirstName(String firstName) {
        return null;
    }

    @Override
    public Set<Seller> findAll() {
        return this.findAll();
    }

    @Override
    public Seller findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Seller save(Seller object) {
        return super.save(object);
    }

    @Override
    public void delete(Seller object) {
      super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
