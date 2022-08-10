package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BuildingCentralDaoTest {

    public static final  String BUILDING_STAW = "Staw";
    public static final  String BUILDING_STUDNIA = "Studnia";
    public static final  int TOTAL_BUILDING = 3;

@Autowired
BuildingCentralDao buildingCentralDao;

    @BeforeEach
    void setUp() {
        BuildingsEntityCentral buildingsEntityCentral1 = new BuildingsEntityCentral(BUILDING_STAW);
        BuildingsEntityCentral buildingsEntityCentral2 = new BuildingsEntityCentral(BUILDING_STUDNIA);
        BuildingsEntityCentral buildingsEntityCentral3 = new BuildingsEntityCentral(BUILDING_STUDNIA);

        assertNull(buildingsEntityCentral1.getId());
        assertNull(buildingsEntityCentral2.getId());
        assertNull(buildingsEntityCentral3.getId());

        buildingCentralDao.save(buildingsEntityCentral1);
        buildingCentralDao.save(buildingsEntityCentral2);
        buildingCentralDao.save(buildingsEntityCentral3);

        assertNotNull(buildingsEntityCentral1.getId());
        assertNotNull(buildingsEntityCentral2.getId());
        assertNotNull(buildingsEntityCentral3.getId());
    }

    @Test
    void testFetchData(){
        BuildingsEntityCentral buildingsEntityCentral = buildingCentralDao.findFirstByName(BUILDING_STUDNIA);
        assertEquals(BUILDING_STUDNIA,buildingsEntityCentral.getName(),"Znaleziono nieprawidłową nazwę");
    }

    @Test
    void testFetchAllData(){
        Collection buildingsEntityCentral = (Collection) buildingCentralDao.findAll();
        assertEquals(TOTAL_BUILDING, buildingsEntityCentral.size(),"Nieprawidłowa liczba budynków");
    }


}