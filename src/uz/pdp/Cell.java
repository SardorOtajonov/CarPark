package uz.pdp;

public class Cell {
    private Car car;
    private String cellId;
    private  String sign=CarType.EMPTY_SIGN;

    public Cell(Car car, String cellId) {
        this.car = car;
        this.cellId = cellId;
    }

    public Cell() {
    }

    public Cell(int cellIdAsInt) {
        this.cellId=String.valueOf(cellIdAsInt);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "car=" + car +
                ", cellId='" + cellId + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
