package uz.pdp;

import java.util.Arrays;

public class Row {
    private Cell[] cells;
    private String rowId;
    public Row() {
    }
    public Row(Cell[] cells, String rowId) {
        this.cells = cells;
        this.rowId = rowId;
    }


    public Row(int rowIdAsInt) {
        this.rowId=String.valueOf(rowIdAsInt);
    }
//    public Row(int rowIdAsInt, int cellCount) {
//        this(rowIdAsInt);
//        this.cells=this.builRow(cellCount);
//    }

    public Cell[] getCells() {
        return cells;
    }

    public void setCells(Cell[] cells) {
        this.cells = cells;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @Override
    public String toString() {
        return "Row{" +
                "cells=" + Arrays.toString(cells) +
                ", rowId='" + rowId + '\'' +
                '}';
    }

    public void builRow(int cellCount) {
      this.cells=new Cell[cellCount];
        for (int i = 0; i < cellCount; i++) {
            this.cells[i]=new Cell(i);
        }

    }
}
