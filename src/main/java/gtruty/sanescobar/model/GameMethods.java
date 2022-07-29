package gtruty.sanescobar.model;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.VilageService;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class GameMethods {


    @Autowired
    VilageService vilageService;

    @Autowired
    BuildingSouthService buildingSouthService;

    @Autowired
    BuildingEastService buildingEastService;

    @Autowired
    BuildingCentralService buildingCentralService;

    @Autowired
    BuildingNorthService buildingNorthService;

    @Autowired
    BuildingWestService buildingWestService;

    @Autowired
    FieldsOfStartService fieldsOfStartService;

    @Autowired
    FieldCentralService fieldCentralService;

    @Autowired
    FieldEastService fieldEastService;

    @Autowired
    FieldNorthService fieldNorthService;

    @Autowired
    FieldSouthService fieldSouthService;

    @Autowired
    FieldWestService fieldWestService;

    public void startVilageLoaded(VilageEntity vilage, Model model, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService, FieldWestService fieldWestService, FieldEastService fieldEastService, FieldNorthService fieldNorthService, FieldSouthService fieldSouthService, FieldCentralService fieldCentralService) {
        if (vilage.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());
            model.addAttribute("fields", fieldNorthService.getAllData());

        } else if (vilage.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());
            model.addAttribute("fields", fieldEastService.getAllData());

        } else if (vilage.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());
            model.addAttribute("fields", fieldCentralService.getAllData());

        } else if (vilage.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());
            model.addAttribute("fields", fieldSouthService.getAllData());

        } else if (vilage.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());
            model.addAttribute("fields", fieldWestService.getAllData());
        }
    }

}
