package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BuildingNorthDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
    BuildingNorthDao buildingNorthDao;

    @BeforeEach
    void setUp() {
        BuildingsEntityNorth buildingsEntityNorth1 = new BuildingsEntityNorth(BUILDING_STAW);
        BuildingsEntityNorth buildingsEntityNorth2 = new BuildingsEntityNorth(BUILDING_STUDNIA);
        BuildingsEntityNorth buildingsEntityNorth3 = new BuildingsEntityNorth(BUILDING_STUDNIA);

        assertNull(buildingsEntityNorth1.getId());
        assertNull(buildingsEntityNorth2.getId());
        assertNull(buildingsEntityNorth3.getId());

        buildingNorthDao.save(buildingsEntityNorth1);
        buildingNorthDao.save(buildingsEntityNorth2);
        buildingNorthDao.save(buildingsEntityNorth3);

        assertNotNull(buildingsEntityNorth1.getId());
        assertNotNull(buildingsEntityNorth2.getId());
        assertNotNull(buildingsEntityNorth3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntityNorth buildingsEntityNorth = buildingNorthDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsEntityNorth.getName(),"Znaleziono nieprawidłową nazwę");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsEntityNorth = (Collection) buildingNorthDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsEntityNorth.size(),"Nieprawidłowa liczba budynków");
    }

}