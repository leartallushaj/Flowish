package guru.springframework.flowishshop.bootstrap;

import guru.springframework.flowishshop.model.Buyer;
import guru.springframework.flowishshop.model.Seller;
import guru.springframework.flowishshop.services.BuyerService;
import guru.springframework.flowishshop.services.SellerService;
import guru.springframework.flowishshop.services.map.BuyerServiceMap;
import guru.springframework.flowishshop.services.map.SellerServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BuyerService buyerService;
    private final SellerService sellerService;

    public DataLoader(){
       buyerService = new BuyerServiceMap();
       sellerService = new SellerServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {

        Buyer buyer1 = new Buyer();
        buyer1.setId(1L);
        buyer1.setFirstName("Leart");
        buyer1.setLastName("Allushaj");

        buyerService.save(buyer1);

        Buyer buyer2 = new Buyer();
        buyer2.setId(2L);
        buyer2.setFirstName("Michael");
        buyer2.setLastName("Weston");

        buyerService.save(buyer2);

        System.out.println("Loaded buyers...");

        Seller seller1 = new Seller();
        seller1.setId(1L);
        seller1.setFirstName("Valona");
        seller1.setFirstName("Shop");

        sellerService.save(seller1);

        Seller seller2 = new Seller();

        seller2.setId(2L);
        seller2.setFirstName("Tirana");
        seller2.setLastName("Shop");

        sellerService.save(seller2);

        System.out.println("Loaded Sellers");
    }
}
