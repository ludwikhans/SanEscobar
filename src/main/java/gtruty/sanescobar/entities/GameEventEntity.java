package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "event")
public class GameEventEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column (name = "info")
    private String info;

    public GameEventEntity(String name) {
        this.name = name;
    }

    public GameEventEntity() {

    }

    public GameEventEntity(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
