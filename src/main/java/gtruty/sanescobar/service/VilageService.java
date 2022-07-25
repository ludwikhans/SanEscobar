package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.VilageEntity;

import java.util.List;

public interface VilageService {
    void save(String name, Long locationId);
    void save (VilageEntity vilageEntity);
    VilageEntity getAnyVilage();



}
