package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
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
class GoodsNorthDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired
    GoodsNorthDao goodsNorthDao;

    @BeforeEach
    void setUp() {
        GoodsNorthEntities goodsNorthEntities1 = new GoodsNorthEntities(GOODS_OWIES);
        GoodsNorthEntities goodsNorthEntities2 = new GoodsNorthEntities(GOODS_MUSTANG);
        GoodsNorthEntities goodsNorthEntities3 = new GoodsNorthEntities(GOODS_MUSTANG);

        assertNull(goodsNorthEntities1.getId());
        assertNull(goodsNorthEntities2.getId());
        assertNull(goodsNorthEntities3.getId());

        goodsNorthDao.save(goodsNorthEntities1);
        goodsNorthDao.save(goodsNorthEntities2);
        goodsNorthDao.save(goodsNorthEntities3);

        assertNotNull(goodsNorthEntities1.getId());
        assertNotNull(goodsNorthEntities2.getId());
        assertNotNull(goodsNorthEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsNorthEntities goodsNorthEntities = goodsNorthDao.findFirstByName(GOODS_MUSTANG);
        assertEquals(GOODS_MUSTANG,goodsNorthEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsNorthEntities = (Collection) goodsNorthDao.findAll();
        assertEquals(TOTAL_GOODS, goodsNorthEntities.size(),"Nieprawidłowa liczba pól");
    }

}