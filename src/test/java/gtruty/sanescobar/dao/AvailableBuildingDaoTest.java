package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.BuildingsEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AvailableBuildingDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

    @Autowired
    AvailableBuildingDao availableBuildingDao;

    @BeforeEach
    void setUp() {
        BuildingsAvailableEntity buildingsAvailableEntity1 = new BuildingsAvailableEntity(BUILDING_STAW);
        BuildingsAvailableEntity buildingsAvailableEntity2 = new BuildingsAvailableEntity(BUILDING_STUDNIA);
        BuildingsAvailableEntity buildingsAvailableEntity3 = new BuildingsAvailableEntity(BUILDING_STUDNIA);

        assertNull(buildingsAvailableEntity1.getId());
        assertNull(buildingsAvailableEntity2.getId());
        assertNull(buildingsAvailableEntity3.getId());

        availableBuildingDao.save(buildingsAvailableEntity1);
        availableBuildingDao.save(buildingsAvailableEntity2);
        availableBuildingDao.save(buildingsAvailableEntity3);

        assertNotNull(buildingsAvailableEntity1.getId());
        assertNotNull(buildingsAvailableEntity2.getId());
        assertNotNull(buildingsAvailableEntity3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsAvailableEntity buildingsAvailableEntity = availableBuildingDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsAvailableEntity.getName(),"Znaleziono nieprawidłowy budynek");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsAvailableEntity = (Collection) availableBuildingDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsAvailableEntity.size(),"Nieprawidłowa liczba budynków");
    }

}