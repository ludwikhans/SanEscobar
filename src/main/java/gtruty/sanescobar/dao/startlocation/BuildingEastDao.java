package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuildingEastDao extends CrudRepository<BuildingsEntityEast, Long> {

    @Query("SELECT sum(placeForGoods) from BuildingsEntityEast")
    int sumCreditAmount();

    BuildingsEntityEast findById(int id);
    BuildingsEntityEast findByName(String name);
    BuildingsEntityEast findFirstByName(String name);
    BuildingsEntityEast findByProducts1(String name);
    BuildingsEntityEast findFirstByAnimalInBuilding(String name);


}
