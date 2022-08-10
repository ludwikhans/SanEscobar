package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class FieldNorthDaoTest {

    public static final  String POLE = "Pole";
    public static final  String ŁĄKA = "Łąka";
    public static final  int TOTAL_FIELD = 3;

    @Autowired
    FieldNorthDao fieldNorthDao;

    @BeforeEach
    void setUp() {
        FieldNorthEntity fieldNorthEntity1 = new FieldNorthEntity(POLE);
        FieldNorthEntity fieldNorthEntity2 = new FieldNorthEntity(ŁĄKA);
        FieldNorthEntity fieldNorthEntity3 = new FieldNorthEntity(ŁĄKA);

        assertNull(fieldNorthEntity1.getId());
        assertNull(fieldNorthEntity2.getId());
        assertNull(fieldNorthEntity3.getId());

        fieldNorthDao.save(fieldNorthEntity1);
        fieldNorthDao.save(fieldNorthEntity2);
        fieldNorthDao.save(fieldNorthEntity3);

        assertNotNull(fieldNorthEntity1.getId());
        assertNotNull(fieldNorthEntity2.getId());
        assertNotNull(fieldNorthEntity3.getId());
    }

    @Test
    void testFetchData(){
        FieldNorthEntity fieldNorthEntity = fieldNorthDao.findFirstByName(ŁĄKA);
        assertEquals(ŁĄKA,fieldNorthEntity.getName(),"Znaleziono nieprawidłowe pole");
    }

    @Test
    void testFetchAllData(){
        Collection fieldNorthEntity = (Collection) fieldNorthDao.findAll();
        assertEquals(TOTAL_FIELD, fieldNorthEntity.size(),"Nieprawidłowa liczba pól");
    }

}