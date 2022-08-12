package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FieldCentralDaoTest {

    public static final  String POLE = "Pole";
    public static final  String ŁĄKA = "Łąka";
    public static final  int TOTAL_FIELD = 3;

    @Autowired
    FieldCentralDao fieldCentralDao;

    @BeforeEach
    void setUp() {
        FieldCentralEntity fieldCentralEntity1 = new FieldCentralEntity(POLE);
        FieldCentralEntity fieldCentralEntity2 = new FieldCentralEntity(ŁĄKA);
        FieldCentralEntity fieldCentralEntity3 = new FieldCentralEntity(ŁĄKA);

        assertNull(fieldCentralEntity1.getId());
        assertNull(fieldCentralEntity2.getId());
        assertNull(fieldCentralEntity3.getId());

        fieldCentralDao.save(fieldCentralEntity1);
        fieldCentralDao.save(fieldCentralEntity2);
        fieldCentralDao.save(fieldCentralEntity3);

        assertNotNull(fieldCentralEntity1.getId());
        assertNotNull(fieldCentralEntity2.getId());
        assertNotNull(fieldCentralEntity3.getId());
    }

    @Test
    void testFetchData(){
        FieldCentralEntity fieldCentralEntity = fieldCentralDao.findFirstByName(ŁĄKA);
        assertEquals(ŁĄKA,fieldCentralEntity.getName(),"Znaleziono nieprawidłowe pole");
    }

    @Test
    void testFetchAllData(){
        Collection fieldCentralEntity = (Collection) fieldCentralDao.findAll();
        assertEquals(TOTAL_FIELD, fieldCentralEntity.size(),"Nieprawidłowa liczba pól");
    }

}