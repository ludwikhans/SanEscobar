package gtruty.sanescobar.model;

import javax.validation.constraints.Size;
import java.util.Date;

public class VilageModel {

    @Size(min = 2, max = 30)
    private String name;
    private Date ctime;

    public VilageModel(String name, Date ctime) {
        this.name = name;
        this.ctime = ctime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
