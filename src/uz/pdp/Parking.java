package uz.pdp;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    private Row[] rows;
    private String parkName;

    public Parking(Row[] rows, String parkName) {
        this.rows = rows;
        this.parkName = parkName;
    }

    public Parking() {
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "rows=" + Arrays.toString(rows) +
                ", parkName='" + parkName + '\'' +
                '}';
    }

    public void buildPark(int rowCount, int cellCount) {
        rows = new Row[rowCount];
        for (int i = 0; i < rowCount; i++) {
         Row row=new Row(i);
         row.builRow(cellCount);
          rows[i]=row;

        }
    }

    public void displayPark() {
        for (Row row : rows) {
            for (Cell cell:row.getCells()) {
                System.out.printf("%s\t",cell.getSign());
            }
            System.out.println("\n");
        }

    }

    public void park(Car car,String carType,String rowIndex,String columnIndex) {
        int rIndex = Integer.parseInt(rowIndex);
       Row row=rows[rIndex];
       int cIndex = Integer.parseInt(columnIndex);
       Cell[] cells=row.getCells();
       Cell cell=cells[cIndex];
       cell.setSign(carType);
       cell.setCar(car);
    }
}
