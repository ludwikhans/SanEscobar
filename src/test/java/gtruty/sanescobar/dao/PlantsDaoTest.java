package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlantsEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PlantsDaoTest {

    public static final  String PLANT_KAPUSTA = "Kapusta";
    public static final  String PLANT_OWIES = "Owies";
    public static final  int TOTAL_PLANTS = 3;

    @Autowired
    PlantsDao plantsDao;

    @BeforeEach
    void setUp() {
        PlantsEntity plantsEntity1 = new PlantsEntity(PLANT_KAPUSTA);
        PlantsEntity plantsEntity2 = new PlantsEntity(PLANT_OWIES);
        PlantsEntity plantsEntity3 = new PlantsEntity(PLANT_OWIES);

        assertNull(plantsEntity1.getId());
        assertNull(plantsEntity2.getId());
        assertNull(plantsEntity3.getId());

        plantsDao.save(plantsEntity1);
        plantsDao.save(plantsEntity2);
        plantsDao.save(plantsEntity3);

        assertNotNull(plantsEntity1.getId());
        assertNotNull(plantsEntity2.getId());
        assertNotNull(plantsEntity3.getId());
    }

    @Test
    void testFetchData(){
        PlantsEntity plantsEntity = plantsDao.findFirstByName(PLANT_OWIES);
        assertEquals(PLANT_OWIES,plantsEntity.getName(),"Znaleziono nieprawidłową roślinę");
    }

    @Test
    void testFetchAllData(){
        Collection plantsEntity = (Collection) plantsDao.findAll();
        assertEquals(TOTAL_PLANTS, plantsEntity.size(),"Nieprawidłowa liczba budynków");
    }

}