package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GoodsAvailableDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired GoodsAvailableDao goodsAvailableDao;

    @BeforeEach
    void setUp() {
        GoodsAvailableEntities goodsNorthEntities1 = new GoodsAvailableEntities(GOODS_MUSTANG);
        GoodsAvailableEntities goodsNorthEntities2 = new GoodsAvailableEntities(GOODS_OWIES);
        GoodsAvailableEntities goodsNorthEntities3 = new GoodsAvailableEntities(GOODS_OWIES);

        assertNull(goodsNorthEntities1.getId());
        assertNull(goodsNorthEntities2.getId());
        assertNull(goodsNorthEntities3.getId());

        goodsAvailableDao.save(goodsNorthEntities1);
        goodsAvailableDao.save(goodsNorthEntities2);
        goodsAvailableDao.save(goodsNorthEntities3);

        assertNotNull(goodsNorthEntities1.getId());
        assertNotNull(goodsNorthEntities2.getId());
        assertNotNull(goodsNorthEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(GOODS_OWIES);
        assertEquals(GOODS_OWIES,goodsAvailableEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsAvailableEntities = (Collection) goodsAvailableDao.findAll();
        assertEquals(TOTAL_GOODS, goodsAvailableEntities.size(),"Nieprawidłowa liczba budynków");
    }

}