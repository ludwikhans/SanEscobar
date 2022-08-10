package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FieldEastDaoTest {

    public static final  String POLE = "Pole";
    public static final  String ŁĄKA = "Łąka";
    public static final  int TOTAL_FIELD = 3;

    @Autowired
    FieldEastDao fieldEastDao;

    @BeforeEach
    void setUp() {
        FieldEastEntity fieldEastEntity1 = new FieldEastEntity(POLE);
        FieldEastEntity fieldEastEntity2 = new FieldEastEntity(ŁĄKA);
        FieldEastEntity fieldEastEntity3 = new FieldEastEntity(ŁĄKA);

        assertNull(fieldEastEntity1.getId());
        assertNull(fieldEastEntity2.getId());
        assertNull(fieldEastEntity3.getId());

        fieldEastDao.save(fieldEastEntity1);
        fieldEastDao.save(fieldEastEntity2);
        fieldEastDao.save(fieldEastEntity3);

        assertNotNull(fieldEastEntity1.getId());
        assertNotNull(fieldEastEntity2.getId());
        assertNotNull(fieldEastEntity3.getId());
    }

    @Test
    void testFetchData(){
        FieldEastEntity fieldEastEntity = fieldEastDao.findFirstByName(ŁĄKA);
        assertEquals(ŁĄKA,fieldEastEntity.getName(),"Znaleziono nieprawidłowe pole");
    }

    @Test
    void testFetchAllData(){
        Collection fieldEastEntity = (Collection) fieldEastDao.findAll();
        assertEquals(TOTAL_FIELD, fieldEastEntity.size(),"Nieprawidłowa liczba pól");
    }

}