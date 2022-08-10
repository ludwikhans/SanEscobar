package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GoodsEastDaoTest {

    public static final  String GOODS_MUSTANG = "Mustang";
    public static final  String GOODS_OWIES = "Owies";
    public static final  int TOTAL_GOODS = 3;

    @Autowired
    GoodsEastDao goodsEastDao;

    @BeforeEach
    void setUp() {
        GoodsEastEntities goodsEastEntities1 = new GoodsEastEntities(GOODS_OWIES);
        GoodsEastEntities goodsEastEntities2 = new GoodsEastEntities(GOODS_MUSTANG);
        GoodsEastEntities goodsEastEntities3 = new GoodsEastEntities(GOODS_MUSTANG);

        assertNull(goodsEastEntities1.getId());
        assertNull(goodsEastEntities2.getId());
        assertNull(goodsEastEntities3.getId());

        goodsEastDao.save(goodsEastEntities1);
        goodsEastDao.save(goodsEastEntities2);
        goodsEastDao.save(goodsEastEntities3);

        assertNotNull(goodsEastEntities1.getId());
        assertNotNull(goodsEastEntities2.getId());
        assertNotNull(goodsEastEntities3.getId());
    }

    @Test
    void testFetchData(){
        GoodsEastEntities goodsEastEntities = goodsEastDao.findFirstByName(GOODS_MUSTANG);
        assertEquals(GOODS_MUSTANG,goodsEastEntities.getName(),"Znaleziono nieprawidłowy towar");
    }

    @Test
    void testFetchAllData(){
        Collection goodsEastEntities = (Collection) goodsEastDao.findAll();
        assertEquals(TOTAL_GOODS, goodsEastEntities.size(),"Nieprawidłowa liczba pól");
    }

}