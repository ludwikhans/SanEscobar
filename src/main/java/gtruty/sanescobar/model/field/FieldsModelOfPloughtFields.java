package gtruty.sanescobar.model.field;

import java.math.BigDecimal;

public class FieldsModelOfPloughtFields {




        private String name = "Pole";

        private Integer area;

        private String info = "Można je obsiać roślinami";

        private Integer areaOfPloughtFields;

        private String seed;

        public FieldsModelOfPloughtFields(Integer area) {
                this.area = area;
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
