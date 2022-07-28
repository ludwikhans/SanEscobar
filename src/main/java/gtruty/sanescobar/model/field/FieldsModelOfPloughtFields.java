package gtruty.sanescobar.model.field;

import java.math.BigDecimal;

public class FieldsModelOfPloughtFields {


        private Integer areaOfmeadow = 1;
        private Long id;

        private TypeOfField typeOfField = TypeOfField.POLE;

        private BigDecimal costOfBuying = BigDecimal.valueOf(50);

        private Integer area = 1;

        private String info = "Można je obsiać roślinami";

        private Integer areaOfPloughtFields = 1;

        private String seed;

        public FieldsModelOfPloughtFields() {
        }

        public FieldsModelOfPloughtFields(String seed) {
                this.seed = seed;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public TypeOfField getTypeOfField() {
                return typeOfField;
        }

        public void setTypeOfField(TypeOfField typeOfField) {
                this.typeOfField = typeOfField;
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
