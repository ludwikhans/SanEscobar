package gtruty.sanescobar.model;

import javax.validation.constraints.Size;
import java.util.Date;

public class VilageModel {

    @Size(min = 2, max = 30)
    private String name;
    private Long locationId;

    public VilageModel() {
    }

    public VilageModel(String name, Long locationId) {
        this.name = name;
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
