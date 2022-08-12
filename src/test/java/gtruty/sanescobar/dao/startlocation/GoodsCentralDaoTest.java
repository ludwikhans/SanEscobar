package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
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
class GoodsCentralDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired
    GoodsCentralDao goodsCentralDao;

    @BeforeEach
    void setUp() {
        GoodsCentralEntities goodsCentralEntities1 = new GoodsCentralEntities(GOODS_OWIES);
        GoodsCentralEntities goodsCentralEntities2 = new GoodsCentralEntities(GOODS_MUSTANG);
        GoodsCentralEntities goodsCentralEntities3 = new GoodsCentralEntities(GOODS_MUSTANG);

        assertNull(goodsCentralEntities1.getId());
        assertNull(goodsCentralEntities2.getId());
        assertNull(goodsCentralEntities3.getId());

        goodsCentralDao.save(goodsCentralEntities1);
        goodsCentralDao.save(goodsCentralEntities2);
        goodsCentralDao.save(goodsCentralEntities3);

        assertNotNull(goodsCentralEntities1.getId());
        assertNotNull(goodsCentralEntities2.getId());
        assertNotNull(goodsCentralEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsCentralEntities goodsCentralEntities = goodsCentralDao.findFirstByName(GOODS_MUSTANG);
        assertEquals(GOODS_MUSTANG,goodsCentralEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsCentralEntities = (Collection) goodsCentralDao.findAll();
        assertEquals(TOTAL_GOODS, goodsCentralEntities.size(),"Nieprawidłowa liczba pól");
    }

}