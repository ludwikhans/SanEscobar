package gtruty.sanescobar.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_parameter")
public class NextTurnParameterEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Long locationId;

    public NextTurnParameterEntity() {
    }

    public NextTurnParameterEntity(String name) {
        this.name = name;
    }

    public NextTurnParameterEntity(String name, Long locationId) {
        this.id = id;
        this.name = name;
        this.locationId = locationId;
    }


}
