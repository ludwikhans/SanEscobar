package gtruty.sanescobar.dao;


import gtruty.sanescobar.entities.GameEventEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameEventDao extends CrudRepository<GameEventEntity, Integer> {
    GameEventEntity findById(int id);

    GameEventEntity findFirstByName(String name);

    @Query( value = "SELECT * FROM event ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    GameEventEntity getRandomEvent();


}