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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {


    @Autowired
    VilageService vilageService;

    @GetMapping("/start")
    public String startPage(String name,Model model){

        vilageService.save(new VilageEntity(name));

        return "gameView";
    }


}
