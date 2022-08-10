package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BuildingEastDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
BuildingEastDao buildingEastDao;

    @BeforeEach
    void setUp() {
        BuildingsEntityEast buildingsEntityEast1 = new BuildingsEntityEast(BUILDING_STAW);
        BuildingsEntityEast buildingsEntityEast2 = new BuildingsEntityEast(BUILDING_STUDNIA);
        BuildingsEntityEast buildingsEntityEast3 = new BuildingsEntityEast(BUILDING_STUDNIA);

        assertNull(buildingsEntityEast1.getId());
        assertNull(buildingsEntityEast2.getId());
        assertNull(buildingsEntityEast3.getId());

        buildingEastDao.save(buildingsEntityEast1);
        buildingEastDao.save(buildingsEntityEast2);
        buildingEastDao.save(buildingsEntityEast3);

        assertNotNull(buildingsEntityEast1.getId());
        assertNotNull(buildingsEntityEast2.getId());
        assertNotNull(buildingsEntityEast3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntityEast buildingsEntityEast = buildingEastDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsEntityEast.getName(),"Znaleziono nieprawidłową nazwę");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsEntityEast = (Collection) buildingEastDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsEntityEast.size(),"Nieprawidłowa liczba budynków");
    }

}