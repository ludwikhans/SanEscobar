package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.AnimalsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AnimalDaoTest {

    public static final  String ANIMAL_MUSTANG = "Mustang";
    public static final  String ANIMAL_KOŃ = "Koń";
    public static final  int TOTAL_ANIMALS = 3;

    @Autowired
    AnimalDao animalDao;

    @BeforeEach
    void setUp() {
        AnimalsEntity animalsEntity1 = new AnimalsEntity(ANIMAL_KOŃ);
        AnimalsEntity animalsEntity2 = new AnimalsEntity(ANIMAL_MUSTANG);
        AnimalsEntity animalsEntity3 = new AnimalsEntity(ANIMAL_MUSTANG);

        assertNull(animalsEntity1.getId());
        assertNull(animalsEntity2.getId());
        assertNull(animalsEntity3.getId());

        animalDao.save(animalsEntity1);
        animalDao.save(animalsEntity2);
        animalDao.save(animalsEntity3);

        assertNotNull(animalsEntity1.getId());
        assertNotNull(animalsEntity2.getId());
        assertNotNull(animalsEntity3.getId());
    }

    @Test
    void testFetchData(){
        AnimalsEntity animalsEntity = animalDao.findFirstByName(ANIMAL_MUSTANG);
        assertEquals(ANIMAL_MUSTANG,animalsEntity.getName(),"Znaleziono nieprawidłowe zwierzę");
    }

    @Test
    void testFetchAllData(){
        Collection animalsEntity = (Collection) animalDao.findAll();
        assertEquals(TOTAL_ANIMALS, animalsEntity.size(),"Nieprawidłowa liczba zwierząt");
    }

}