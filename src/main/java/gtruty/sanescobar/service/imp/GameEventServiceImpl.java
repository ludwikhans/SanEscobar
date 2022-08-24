package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.FieldDao;
import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.FieldsEntity;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.service.FieldService;
import gtruty.sanescobar.service.GameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GameEventServiceImpl implements GameEventService {

    @Autowired
    GameEventDao gameEventDao;

    @Override
    public void save(GameEventEntity gameEvent) {
        gameEventDao.save(gameEvent);
    }

    @Override
    public void save(String name, String info) {
        gameEventDao.save(new GameEventEntity(name, info));
    }

    @Override
    public List<GameEventEntity> getAllData() {
        var event = gameEventDao.findAll();
        return (List<GameEventEntity>) event;
    }



}
