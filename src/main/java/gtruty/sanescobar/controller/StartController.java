package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.VilageDao;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.VilageModel;
import gtruty.sanescobar.model.parameters.PlaceOfStarts;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
        vilageService.save(vilage.getName());
        return "redirect:/gameView";
    }


}
