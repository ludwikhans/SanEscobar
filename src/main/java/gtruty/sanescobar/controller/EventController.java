package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.service.GameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;


@Controller
public class EventController {

    @Autowired
    GameEventService eventService;

    @Autowired
    GameEventDao gameEventDao;


    @GetMapping("/event")
    public String eventPage(Model model) {


        List<GameEventEntity> events = eventService.getAllData();
        Random random = new Random();
        int i = random.nextInt(events.size());
        GameEventEntity gameEvent = gameEventDao.findById(i);
        model.addAttribute("event", gameEvent);



        return "gameEvent";
    }


}






