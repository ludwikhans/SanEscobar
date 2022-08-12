package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuildingWestDao extends CrudRepository<BuildingsEntityWest, Long> {

    @Query("SELECT sum(placeForGoods) from BuildingsEntityWest")
    int sumCreditAmount();

    BuildingsEntityWest findById(int id);
    BuildingsEntityWest findFirstByName(String name);
    BuildingsEntityWest findByName(String name);
    BuildingsEntityWest findByProducts1(String name);
    BuildingsEntityWest findFirstByAnimalInBuilding(String name);
}
