package gtruty.sanescobar.model;

import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.VilageService;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public class Game implements GameMetod{

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

    @Override
    public void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) {

        if (vilage.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());


            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Pszenica Ozima");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            List<StartFieldEntity> startFieldEntity = fieldsOfStartService.getAllData();
            model.addAttribute("fields",startFieldEntity);

        } else if (vilage.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Owies");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Pszenica Jara");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Jęczmień");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());


            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Żyto");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());
        }
    }

    @Override
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
