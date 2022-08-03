package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlantsEntity;

import java.util.List;

public interface PlantService {
    void save (PlantsEntity plantsEntity);
    List<PlantsEntity> getAllData();

}
