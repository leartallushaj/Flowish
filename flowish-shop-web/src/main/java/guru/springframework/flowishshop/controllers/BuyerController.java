package guru.springframework.flowishshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyerController {

    @RequestMapping({"/buyers","/buyers/index","/buyers/index.html"})
    public String listBuyers(){
        return "buyers/index";
    }

}
