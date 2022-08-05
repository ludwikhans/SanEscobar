package gtruty.sanescobar.model.field;

import java.math.BigDecimal;

public class FieldModel {
    FieldsModelOfMeadow fieldsModelOfMeadow;
    FieldsModelOfPloughtFields fieldsModelOfPloughtFields;
    private BigDecimal costOfBuying = BigDecimal.valueOf(100);
    int area;

    public FieldModel(int area) {
        this.fieldsModelOfMeadow = new FieldsModelOfMeadow(area);
        this.fieldsModelOfPloughtFields = new FieldsModelOfPloughtFields(area);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
