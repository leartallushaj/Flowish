package guru.springframework.flowishshop.controllers;

import guru.springframework.flowishshop.services.SellerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellerController {

    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @RequestMapping({"/sellers", "/sellers/index", "/sellers/index.html"})
    public String listSellers(Model model){
        model.addAttribute("seller", sellerService.findAll());
        return "sellers/index";

    }

}
