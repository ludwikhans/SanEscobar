package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.GameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Random;

@SessionAttributes("game")
@Controller
public class EventController {

    @Autowired
    GameEventService eventService;

    @Autowired
    GameEventDao gameEventDao;


    @GetMapping("/event")
    public String eventPage(@ModelAttribute("game") GameModel gameModel,
                            Model model) {


        List<GameEventEntity> events = eventService.getAllData();
        Random random = new Random();
        int i = random.nextInt(events.size()) + 1;
        GameEventEntity gameEvent = gameEventDao.getRandomEvent();
        gameModel.processEvent(gameEvent);
        model.addAttribute("game", gameModel);
        model.addAttribute("event", gameEvent);



        return "gameEvent";
    }

    @PostMapping("/event")
    public String nextTurn(@ModelAttribute("game") GameModel gameModel,
                           RedirectAttributes redirect) {
        redirect.addFlashAttribute("game", gameModel);
        return "redirect:/gameNextTurn";
    }

}






