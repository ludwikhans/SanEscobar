package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.VilageDao;
import gtruty.sanescobar.model.VilageModel;
import gtruty.sanescobar.model.parameters.PlaceOfStarts;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {

    @Autowired
    VilageDao vilageDao;

    private final VilageService vilageService;

    public StartController(VilageService vilageService) {
        this.vilageService = vilageService;
    }

    @GetMapping("/start")
    public String startPage(
            @ModelAttribute("vilage") VilageModel vilage,
            Model model){

        model.addAttribute("vilage",vilage);

        return "start";
    }


    @PostMapping("/start")
    public String saveVilageName(
            @ModelAttribute("vilage") VilageModel vilage,
            BindingResult bindingResult,
            Model model
    ){
        if (bindingResult.hasErrors()){
            return "start";
        }

        vilageService.saveVilage(vilage);
        return "start";
    }

}
