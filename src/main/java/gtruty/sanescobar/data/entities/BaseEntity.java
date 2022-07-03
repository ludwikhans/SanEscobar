package gtruty.sanescobar.data.entities;

import javax.persistence.*;

@Entity
@Inheritance
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "purchase_summary_entity_id")
    private PurchaseSummaryEntity purchaseSummaryEntity;

    public PurchaseSummaryEntity getPurchaseSummaryEntity() {
        return purchaseSummaryEntity;
    }

    public void setPurchaseSummaryEntity(PurchaseSummaryEntity purchaseSummaryEntity) {
        this.purchaseSummaryEntity = purchaseSummaryEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
