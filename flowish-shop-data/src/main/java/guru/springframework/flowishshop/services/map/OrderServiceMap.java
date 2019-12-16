package guru.springframework.flowishshop.services.map;

import guru.springframework.flowishshop.model.Order;
import guru.springframework.flowishshop.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderServiceMap extends AbstractMapService<Order, Long> implements OrderService {

    @Override
    public Set<Order> findAll() {
        return this.findAll();
    }

    @Override
    public Order findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Order save(Order object) {
        return super.save(object);
    }

    @Override
    public void delete(Order object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
