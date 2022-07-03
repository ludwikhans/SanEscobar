package gtruty.sanescobar.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "event")
public class EventEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column (name = "info")
    private String info;
}
