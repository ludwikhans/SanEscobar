package gtruty.sanescobar.controller;

import gtruty.sanescobar.model.VilageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class StartController {

    @GetMapping("/start")
    public String startPage(
            @ModelAttribute("vilages") VilageModel vilage,
            Model model){
        return "start";
    }
}
