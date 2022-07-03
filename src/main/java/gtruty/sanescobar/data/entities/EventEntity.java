package gtruty.sanescobar.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "event")
public class EventEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column (name = "info")
    private String info;
}
