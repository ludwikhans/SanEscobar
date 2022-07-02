package gtruty.sanescobar.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Purchase")
public class PurchaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long Id;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "name")
    static private String name;
    private String type;

    @ManyToOne
    private Set<AnimalsEntity> animalsEntities;
    @ManyToOne
    private Set<PlantsEntity> plantsEntities;
    @ManyToOne
    private Set<BuildingsEntity> buildingsEntities;
    @ManyToOne
    private Set<FieldsEntity> fieldsEntities;


    public PurchaseEntity(Long id, Long amount, Set<AnimalsEntity> animalsEntities, Set<PlantsEntity> plantsEntities, Set<BuildingsEntity> buildingsEntities, Set<FieldsEntity> fieldsEntities) {
        Id = id;
        this.amount = amount;
        this.animalsEntities = animalsEntities;
        this.plantsEntities = plantsEntities;
        this.buildingsEntities = buildingsEntities;
        this.fieldsEntities = fieldsEntities;
    }
}
