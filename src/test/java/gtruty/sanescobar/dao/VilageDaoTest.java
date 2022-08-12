package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class VilageDaoTest {

    public static final  String VILAGE_GORLICE = "Gorlice";
    public static final  String VILAGE_BIECZ = "Biecz";
    public static final  int TOTAL_VILAGE = 3;

    @Autowired
    VilageDao vilageDao;

    @BeforeEach
    void setUp() {
        VilageEntity vilage1 = new VilageEntity(VILAGE_GORLICE);
        VilageEntity vilage2 = new VilageEntity(VILAGE_GORLICE);
        VilageEntity vilage3 = new VilageEntity(VILAGE_BIECZ);

        assertNull(vilage1.getId());
        assertNull(vilage2.getId());
        assertNull(vilage3.getId());

        vilageDao.save(vilage1);
        vilageDao.save(vilage2);
        vilageDao.save(vilage3);

        assertNotNull(vilage1.getId());
        assertNotNull(vilage2.getId());
        assertNotNull(vilage3.getId());
    }

    @Test
    void testFetchData(){
        VilageEntity vilage = vilageDao.findFirstByName(VILAGE_GORLICE);
        assertEquals(VILAGE_GORLICE,vilage.getName(),"Znaleziono nieprawidłową wieś");
    }

    @Test
    void testFetchAllData(){
        Collection vilage = (Collection) vilageDao.findAll();
        assertEquals(TOTAL_VILAGE, vilage.size(),"Nieprawidłowa liczba budynków");
    }

}