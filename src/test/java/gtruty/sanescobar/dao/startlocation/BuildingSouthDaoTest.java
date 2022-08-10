package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BuildingSouthDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
    BuildingSouthDao buildingSouthDao;

    @BeforeEach
    void setUp() {
        BuildingsEntitySouth buildingsEntitySouth1 = new BuildingsEntitySouth(BUILDING_STAW);
        BuildingsEntitySouth buildingsEntitySouth2 = new BuildingsEntitySouth(BUILDING_STUDNIA);
        BuildingsEntitySouth buildingsEntitySouth3 = new BuildingsEntitySouth(BUILDING_STUDNIA);

        assertNull(buildingsEntitySouth1.getId());
        assertNull(buildingsEntitySouth2.getId());
        assertNull(buildingsEntitySouth3.getId());

        buildingSouthDao.save(buildingsEntitySouth1);
        buildingSouthDao.save(buildingsEntitySouth2);
        buildingSouthDao.save(buildingsEntitySouth3);

        assertNotNull(buildingsEntitySouth1.getId());
        assertNotNull(buildingsEntitySouth2.getId());
        assertNotNull(buildingsEntitySouth3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntitySouth buildingsEntitySouth = buildingSouthDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsEntitySouth.getName(),"Znaleziono nieprawidłową nazwę");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsEntitySouth = (Collection) buildingSouthDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsEntitySouth.size(),"Nieprawidłowa liczba budynków");
    }

}