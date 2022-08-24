package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.GameEventEntity;

import java.util.List;

public interface GameEventService {
    void save (GameEventEntity eventEntity);
    void save(String name, String info);
    List<GameEventEntity> getAllData();
}
