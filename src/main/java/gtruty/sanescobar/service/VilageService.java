package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.mapper.VilageMapper;
import gtruty.sanescobar.model.VilageModel;
import gtruty.sanescobar.repository.VilageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VilageService {

    private final VilageRepository vilageRepository;

    public VilageService(VilageRepository vilageRepository) {
        this.vilageRepository = vilageRepository;
    }

    @Transactional
    public void saveVilage(VilageModel vilageModel){
      VilageEntity vilageEntity = new VilageEntity();
       vilageEntity.setName(vilageEntity.getName());


      vilageRepository.save(vilageEntity);

    }
}
