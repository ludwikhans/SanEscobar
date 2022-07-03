package gtruty.sanescobar.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PurchaseSummaryEntity extends BaseEntity {

    @OneToMany(mappedBy = "purchaseSummary")
    Set<BaseEntity> purchasedEntities;
}
