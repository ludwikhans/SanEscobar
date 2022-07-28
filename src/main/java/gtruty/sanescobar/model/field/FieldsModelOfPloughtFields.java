package gtruty.sanescobar.model.field;

import java.math.BigDecimal;

public class FieldsModelOfPloughtFields {




        private String name = "Pole";

        private BigDecimal costOfBuying = BigDecimal.valueOf(50);

        private Integer area = 1;

        private String info = "Można je obsiać roślinami";

        private Integer areaOfPloughtFields = 1;

        private String seed;

        public FieldsModelOfPloughtFields(String seed) {
                this.seed = seed;
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

        public Integer getAreaOfPloughtFields() {
                return areaOfPloughtFields;
        }

        public void setAreaOfPloughtFields(Integer areaOfPloughtFields) {
                this.areaOfPloughtFields = areaOfPloughtFields;
        }

        public String getSeed() {
                return seed;
        }

        public void setSeed(String seed) {
                this.seed = seed;
        }
}
