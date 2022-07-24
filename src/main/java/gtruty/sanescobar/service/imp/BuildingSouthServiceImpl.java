package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.BuildingSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.service.BuildingSouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingSouthServiceImpl implements BuildingSouthService {

    @Autowired
    BuildingSouthDao buildingSouthDao;

    @Override
    public void save(BuildingsEntitySouth buildingsEntitySouth) {
buildingSouthDao.save(buildingsEntitySouth);
    }

    @Override
    public List<BuildingsEntitySouth> getAllData() {
        var buildingSouth = buildingSouthDao.findAll();
        return (List<BuildingsEntitySouth>) buildingSouth;
    }
}
