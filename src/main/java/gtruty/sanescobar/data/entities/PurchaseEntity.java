package gtruty.sanescobar.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Purchase")
public class PurchaseEntity extends BaseEntity {

    @Column(name = "amount")
    private Long amount;
    @Column(name = "purchasedEntityId")
    private Long purchasedEntityId;
    @Column(name = "purchaseSummaryId")
    private Long purchaseSummaryId;
    @ManyToOne
    @JoinColumn(name = "purchaseSummaryId")
    private PurchaseSummaryEntity purchaseSummary;

    @ManyToOne
    @JoinColumn(name = "purchased_entity_id")
    private BaseEntity purchasedEntity;

    public BaseEntity getPurchasedEntity() {
        return purchasedEntity;
    }


    public PurchaseEntity(Long id, Long amount, Set<AnimalsEntity> animalsEntities, Set<PlantsEntity> plantsEntities, Set<BuildingsEntity> buildingsEntities, Set<FieldsEntity> fieldsEntities) {
        this.id = id;
        this.amount = amount;
    }

    public PurchaseEntity() {

    }
}

