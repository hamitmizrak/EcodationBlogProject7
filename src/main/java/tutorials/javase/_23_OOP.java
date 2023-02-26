package tutorials.javase;

import java.util.Objects;

public class _23_OOP {

    //Field: nesne değişkeni
    private String cellphoneName;
    private String cellphoneTrade;
    private double cellphonePrice;

    //parametresiz constructor
    public _23_OOP() {
    }

    //parametresiz constructor
    public _23_OOP(String cellphoneName, String cellphoneTrade, double cellphonePrice) {
        this.cellphoneName = cellphoneName;
        this.cellphoneTrade = cellphoneTrade;
        this.cellphonePrice = cellphonePrice;
    }

    //classın Kimliği T.C
    @Override
    public String toString() {
        return "_23_OOP{" +
                "cellphoneName='" + cellphoneName + '\'' +
                ", cellphoneTrade='" + cellphoneTrade + '\'' +
                ", cellphonePrice=" + cellphonePrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _23_OOP oop = (_23_OOP) o;
        return Double.compare(oop.cellphonePrice, cellphonePrice) == 0 && Objects.equals(cellphoneName, oop.cellphoneName) && Objects.equals(cellphoneTrade, oop.cellphoneTrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cellphoneName, cellphoneTrade, cellphonePrice);
    }

    //Getter and setter
    public String getCellphoneName() {
        return cellphoneName;
    }

    public void setCellphoneName(String cellphoneName) {
        this.cellphoneName = cellphoneName;
    }

    public String getCellphoneTrade() {
        return cellphoneTrade;
    }

    public void setCellphoneTrade(String cellphoneTrade) {
        this.cellphoneTrade = cellphoneTrade;
    }

    public double getCellphonePrice() {
        return cellphonePrice;
    }

    public void setCellphonePrice(double cellphonePrice) {
        this.cellphonePrice = cellphonePrice;
    }
}



