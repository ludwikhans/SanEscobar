package gtruty.sanescobar.mapper;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.VilageModel;

public class VilageMapper {

    public static VilageEntity toEntity(VilageModel vilageModel){
       VilageEntity entity = new VilageEntity();
       entity.setName(vilageModel.getName());
       return entity;
    }
}
