package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class BuildingDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
    BuildingDao buildingDao;

    @BeforeEach
    void setUp() {
        BuildingsEntity buildingsEntity1 = new BuildingsEntity(BUILDING_STAW);
        BuildingsEntity buildingsEntity2 = new BuildingsEntity(BUILDING_STUDNIA);
        BuildingsEntity buildingsEntity3 = new BuildingsEntity(BUILDING_STUDNIA);

        assertNull(buildingsEntity1.getId());
        assertNull(buildingsEntity2.getId());
        assertNull(buildingsEntity3.getId());

        buildingDao.save(buildingsEntity1);
        buildingDao.save(buildingsEntity2);
        buildingDao.save(buildingsEntity3);

        assertNotNull(buildingsEntity1.getId());
        assertNotNull(buildingsEntity2.getId());
        assertNotNull(buildingsEntity3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntity buildings = buildingDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildings.getName(),"Znaleziono nieprawidłowy budynek");
    }

    @Test
    void testFetchAllData(){
        Collection buildings = (Collection) buildingDao.findAll();
        assertEquals(TOTAL_BUILDING, buildings.size(),"Nieprawidłowa liczba budynków");
    }

}