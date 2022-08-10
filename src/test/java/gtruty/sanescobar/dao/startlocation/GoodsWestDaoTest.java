package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsWestEntities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GoodsWestDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired
    GoodsWestDao goodsWestDao;

    @BeforeEach
    void setUp() {
        GoodsWestEntities goodsWestEntities1 = new GoodsWestEntities(GOODS_OWIES);
        GoodsWestEntities goodsWestEntities2 = new GoodsWestEntities(GOODS_MUSTANG);
        GoodsWestEntities goodsWestEntities3 = new GoodsWestEntities(GOODS_MUSTANG);

        assertNull(goodsWestEntities1.getId());
        assertNull(goodsWestEntities2.getId());
        assertNull(goodsWestEntities3.getId());

        goodsWestDao.save(goodsWestEntities1);
        goodsWestDao.save(goodsWestEntities2);
        goodsWestDao.save(goodsWestEntities3);

        assertNotNull(goodsWestEntities1.getId());
        assertNotNull(goodsWestEntities2.getId());
        assertNotNull(goodsWestEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsWestEntities goodsWestEntities = goodsWestDao.findFirstByName(GOODS_MUSTANG);
        assertEquals(GOODS_MUSTANG,goodsWestEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsWestEntities = (Collection) goodsWestDao.findAll();
        assertEquals(TOTAL_GOODS, goodsWestEntities.size(),"Nieprawidłowa liczba pól");
    }

}