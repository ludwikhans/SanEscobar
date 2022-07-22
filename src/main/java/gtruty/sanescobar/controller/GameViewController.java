package gtruty.sanescobar.controller;

import gtruty.sanescobar.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameViewController {

@Value("${Gorlice}")
    private String title;

@Autowired
    BuildingService buildingService;


    @GetMapping("gameView")
    public String startPage(Model model){
        model.addAttribute("nazwa",title);
        model.addAttribute("buildings",buildingService.getAllData());


        return "gameView";
    }



}
