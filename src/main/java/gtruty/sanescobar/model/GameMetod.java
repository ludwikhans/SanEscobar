package gtruty.sanescobar.model;


import gtruty.sanescobar.entities.VilageEntity;

import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.location.*;
import org.springframework.ui.Model;


public interface GameMetod {

    void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) ;

    void startVilageloaded(VilageEntity vilage, Model model,BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService,FieldWestService fieldWestService, FieldEastService fieldEastService, FieldNorthService fieldNorthService, FieldSouthService fieldSouthService, FieldCentralService fieldCentralService) ;
}