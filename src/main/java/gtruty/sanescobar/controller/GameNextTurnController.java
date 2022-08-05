package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.GameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;


@Controller
public class GameNextTurnController {



    @GetMapping("/gameNextTurn")
    public String nextTurnPage(Model model, GameModel gameModel) {





        return "gameNextTurn";
    }


}






