package gtruty.sanescobar.data.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "event")
public class EventEntity{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column (name = "info")
    private String info;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, info);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
