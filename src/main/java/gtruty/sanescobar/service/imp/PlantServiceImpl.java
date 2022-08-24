package gtruty.sanescobar.service.imp;


import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    PlantsDao plantsDao;

    @Override
    public void save(PlantsEntity plantsEntity) {
plantsDao.save(plantsEntity);
    }

    @Override
    public void save(String name, String products, BigDecimal moneyProfit, Double harvest, BigDecimal sowingCost, String requirements, String info, String specialFor, Long yearsOld, String category) {
        plantsDao.save(new PlantsEntity(name,products,moneyProfit,harvest,sowingCost,requirements,info,specialFor,yearsOld,category));
    }

    @Override
    public List<PlantsEntity> getAllData() {

        return (List<PlantsEntity>)  plantsDao.findAll();
    }
}
