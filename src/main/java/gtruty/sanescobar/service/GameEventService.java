package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.GameEventEntity;

import java.util.List;

public interface GameEventService {
    void save (GameEventEntity eventEntity);
    List<GameEventEntity> getAllData();
}
