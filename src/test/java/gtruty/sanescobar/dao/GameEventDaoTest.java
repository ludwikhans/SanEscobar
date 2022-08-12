package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.GameEventEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GameEventDaoTest {

    public static final  String EVENT_BANDYCI = "Bandyci";
    public static final  String EVENT_PECH = "Pech";
    public static final  int TOTAL_EVENT = 3;

    @Autowired
    GameEventDao gameEventDao;

    @BeforeEach
    void setUp() {
        GameEventEntity gameEventEntity1 = new GameEventEntity(EVENT_PECH);
        GameEventEntity gameEventEntity2 = new GameEventEntity(EVENT_BANDYCI);
        GameEventEntity gameEventEntity3 = new GameEventEntity(EVENT_BANDYCI);

        assertNull(gameEventEntity1.getId());
        assertNull(gameEventEntity2.getId());
        assertNull(gameEventEntity3.getId());

        gameEventDao.save(gameEventEntity1);
        gameEventDao.save(gameEventEntity2);
        gameEventDao.save(gameEventEntity3);

        assertNotNull(gameEventEntity1.getId());
        assertNotNull(gameEventEntity2.getId());
        assertNotNull(gameEventEntity3.getId());
    }

    @Test
    void testFetchData(){
        GameEventEntity gameEventEntity = gameEventDao.findFirstByName(EVENT_BANDYCI);
        assertEquals(EVENT_BANDYCI,gameEventEntity.getName(),"Znaleziono nieprawidłowy event");
    }

    @Test
    void testFetchAllData(){
        Collection gameEventEntity = (Collection) gameEventDao.findAll();
        assertEquals(TOTAL_EVENT, gameEventEntity.size(),"Nieprawidłowa liczba budynków");
    }

}