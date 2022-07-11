package gtruty.sanescobar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "vilage")
public class VilageEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Date ctime;


    public VilageEntity() {
    }

    public VilageEntity(Integer id, String name, Date ctime) {
        this.id = id;
        this.name = name;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
