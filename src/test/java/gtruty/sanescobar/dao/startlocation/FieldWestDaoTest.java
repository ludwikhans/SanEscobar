package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FieldWestDaoTest {

    public static final  String POLE = "Pole";
    public static final  String ŁĄKA = "Łąka";
    public static final  int TOTAL_FIELD = 3;

    @Autowired
    FieldWestDao fieldWestDao;

    @BeforeEach
    void setUp() {
        FieldWestEntity fieldWestEntity1 = new FieldWestEntity(POLE);
        FieldWestEntity fieldWestEntity2 = new FieldWestEntity(ŁĄKA);
        FieldWestEntity fieldWestEntity3 = new FieldWestEntity(ŁĄKA);

        assertNull(fieldWestEntity1.getId());
        assertNull(fieldWestEntity2.getId());
        assertNull(fieldWestEntity3.getId());

        fieldWestDao.save(fieldWestEntity1);
        fieldWestDao.save(fieldWestEntity2);
        fieldWestDao.save(fieldWestEntity3);

        assertNotNull(fieldWestEntity1.getId());
        assertNotNull(fieldWestEntity2.getId());
        assertNotNull(fieldWestEntity3.getId());
    }

    @Test
    void testFetchData(){
        FieldWestEntity fieldWestEntity = fieldWestDao.findFirstByName(ŁĄKA);
        assertEquals(ŁĄKA,fieldWestEntity.getName(),"Znaleziono nieprawidłowe pole");
    }

    @Test
    void testFetchAllData(){
        Collection fieldWestEntity = (Collection) fieldWestDao.findAll();
        assertEquals(TOTAL_FIELD, fieldWestEntity.size(),"Nieprawidłowa liczba pól");
    }

}