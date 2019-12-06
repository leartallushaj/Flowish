package guru.springframework.flowishshop.controllers;

import guru.springframework.flowishshop.services.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/buyers")
@Controller
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @RequestMapping({"","/","/index", "/index.html"})
    public String listBuyers(Model model){

        model.addAttribute("buyers", buyerService.findAll());

        return "buyers/index";
    }

}
