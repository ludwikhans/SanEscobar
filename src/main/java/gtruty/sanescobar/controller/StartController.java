package gtruty.sanescobar.controller;


import gtruty.sanescobar.model.VilageModel;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {

    @Autowired
    VilageService vilageService;

    @GetMapping("/start")
    public String startPage(Model model) {
        VilageModel vilage = new VilageModel("", 0L);
        model.addAttribute("vilage", vilage);
        return "start";
    }

    @PostMapping("/start")
    public String saveVilage(@ModelAttribute("vilage") VilageModel vilage) {
        vilageService.save(vilage.getName(), vilage.getLocationId());
        return "redirect:/gameView";
    }


}
