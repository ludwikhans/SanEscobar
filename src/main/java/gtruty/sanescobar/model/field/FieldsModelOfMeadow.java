package gtruty.sanescobar.model.field;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

public class FieldsModelOfMeadow {




        private Long id;
        private String name = "Łąka";
        private BigDecimal costOfBuying = BigDecimal.valueOf(50);
        private Integer area = 1;
        private String info  = "podstawa do hodowli zwierząt";
        private String seed;


        public FieldsModelOfMeadow() {
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

        public BigDecimal getCostOfBuying() {
                return costOfBuying;
        }

        public void setCostOfBuying(BigDecimal costOfBuying) {
                this.costOfBuying = costOfBuying;
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
