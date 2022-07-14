package gtruty.sanescobar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameViewController {




    @GetMapping("gameView")
    public String startPage(){



        return "gameView";
    }



}
