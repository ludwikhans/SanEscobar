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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameEventEntity that = (GameEventEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, info);
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
