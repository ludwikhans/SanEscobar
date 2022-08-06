package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.service.GameEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameEventServiceImpl implements GameEventService {

    @Autowired
    GameEventDao gameEventDao;

    @Override
    public void save(GameEventEntity gameEventEntity) {
gameEventDao.save(gameEventEntity);
    }

    @Override
    public List<GameEventEntity> getAllData() {
        var events = gameEventDao.findAll();
        return (List<GameEventEntity>) events;
    }
}
