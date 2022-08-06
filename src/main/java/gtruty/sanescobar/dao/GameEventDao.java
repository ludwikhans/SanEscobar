package gtruty.sanescobar.dao;


import gtruty.sanescobar.entities.GameEventEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameEventDao extends CrudRepository<GameEventEntity, Integer> {
    GameEventEntity findById(int id);
}