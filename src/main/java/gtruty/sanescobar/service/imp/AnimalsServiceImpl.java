package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.entities.AnimalsEntity;
import gtruty.sanescobar.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    @Autowired
    AnimalDao animalDao;

    @Override
    public void save(AnimalsEntity animalsEntity) {
animalDao.save(animalsEntity);
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuying, String requirements, String suistenance1, Double valueOfSuistenance1, String suistenance2, Double valueOfSuistenance2, String info, String specialFor, Integer typ) {
        animalDao.save(new AnimalsEntity(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuying,requirements,suistenance1,valueOfSuistenance1, suistenance2, valueOfSuistenance2,info,specialFor,typ));
    }

    @Override
    public List<AnimalsEntity> getAllData() {
        var animal = animalDao.findAll();
        return (List<AnimalsEntity>) animal;
    }
}
