package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FieldSouthDaoTest {

    public static final  String POLE = "Pole";
    public static final  String ŁĄKA = "Łąka";
    public static final  int TOTAL_FIELD = 3;

    @Autowired
    FieldSouthDao fieldSouthDao;

    @BeforeEach
    void setUp() {
        FieldSouthEntity fieldSouthEntity1 = new FieldSouthEntity(POLE);
        FieldSouthEntity fieldSouthEntity2 = new FieldSouthEntity(ŁĄKA);
        FieldSouthEntity fieldSouthEntity3 = new FieldSouthEntity(ŁĄKA);

        assertNull(fieldSouthEntity1.getId());
        assertNull(fieldSouthEntity2.getId());
        assertNull(fieldSouthEntity3.getId());

        fieldSouthDao.save(fieldSouthEntity1);
        fieldSouthDao.save(fieldSouthEntity2);
        fieldSouthDao.save(fieldSouthEntity3);

        assertNotNull(fieldSouthEntity1.getId());
        assertNotNull(fieldSouthEntity2.getId());
        assertNotNull(fieldSouthEntity3.getId());
    }

    @Test
    void testFetchData(){
        FieldSouthEntity fieldSouthEntity = fieldSouthDao.findFirstByName(ŁĄKA);
        assertEquals(ŁĄKA,fieldSouthEntity.getName(),"Znaleziono nieprawidłowe pole");
    }

    @Test
    void testFetchAllData(){
        Collection fieldSouthEntity = (Collection) fieldSouthDao.findAll();
        assertEquals(TOTAL_FIELD, fieldSouthEntity.size(),"Nieprawidłowa liczba pól");
    }

}