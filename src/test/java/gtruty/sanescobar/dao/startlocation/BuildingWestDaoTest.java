package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BuildingWestDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
    BuildingWestDao buildingWestDao;

    @BeforeEach
    void setUp() {
        BuildingsEntityWest buildingsEntityWest1 = new BuildingsEntityWest(BUILDING_STAW);
        BuildingsEntityWest buildingsEntityWest2 = new BuildingsEntityWest(BUILDING_STUDNIA);
        BuildingsEntityWest buildingsEntityWest3 = new BuildingsEntityWest(BUILDING_STUDNIA);

        assertNull(buildingsEntityWest1.getId());
        assertNull(buildingsEntityWest2.getId());
        assertNull(buildingsEntityWest3.getId());

        buildingWestDao.save(buildingsEntityWest1);
        buildingWestDao.save(buildingsEntityWest2);
        buildingWestDao.save(buildingsEntityWest3);

        assertNotNull(buildingsEntityWest1.getId());
        assertNotNull(buildingsEntityWest2.getId());
        assertNotNull(buildingsEntityWest3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntityWest buildingsEntityWest = buildingWestDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsEntityWest.getName(),"Znaleziono nieprawidłową nazwę");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsEntityWest = (Collection) buildingWestDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsEntityWest.size(),"Nieprawidłowa liczba budynków");
    }

}