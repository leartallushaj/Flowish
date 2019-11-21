package guru.springframework.flowishshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellerController {

    @RequestMapping({"/sellers", "/sellers/index", "/sellers/index.html"})
    public String listSellers(){
        return "sellers/index";

    }

}
