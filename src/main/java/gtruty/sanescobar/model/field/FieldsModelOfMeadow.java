package gtruty.sanescobar.model.field;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

public class FieldsModelOfMeadow {




        private Long id;
        private String name = "Łąka";
        private Integer area;
        private String info  = "podstawa do hodowli zwierząt";
        private String seed;

        public FieldsModelOfMeadow(Integer area) {
                this.area = area;
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

        public Integer getArea() {
                return area;
        }

        public void setArea(Integer area) {
                this.area = area;
        }

        public String getInfo() {
                return info;
        }

        public void setInfo(String info) {
                this.info = info;
        }

        public String getSeed() {
                return seed;
        }

        public void setSeed(String seed) {
                this.seed = seed;
        }
}

