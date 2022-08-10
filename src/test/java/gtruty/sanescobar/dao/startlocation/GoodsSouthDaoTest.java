package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GoodsSouthDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired
    GoodsSouthDao goodsSouthDao;

    @BeforeEach
    void setUp() {
        GoodsSouthEntities goodsSouthEntities1 = new GoodsSouthEntities(GOODS_OWIES);
        GoodsSouthEntities goodsSouthEntities2 = new GoodsSouthEntities(GOODS_MUSTANG);
        GoodsSouthEntities goodsSouthEntities3 = new GoodsSouthEntities(GOODS_MUSTANG);

        assertNull(goodsSouthEntities1.getId());
        assertNull(goodsSouthEntities2.getId());
        assertNull(goodsSouthEntities3.getId());

        goodsSouthDao.save(goodsSouthEntities1);
        goodsSouthDao.save(goodsSouthEntities2);
        goodsSouthDao.save(goodsSouthEntities3);

        assertNotNull(goodsSouthEntities1.getId());
        assertNotNull(goodsSouthEntities2.getId());
        assertNotNull(goodsSouthEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsSouthEntities goodsSouthEntities = goodsSouthDao.findFirstByName(GOODS_MUSTANG);
        assertEquals(GOODS_MUSTANG,goodsSouthEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsSouthEntities = (Collection) goodsSouthDao.findAll();
        assertEquals(TOTAL_GOODS, goodsSouthEntities.size(),"Nieprawidłowa liczba pól");
    }

}