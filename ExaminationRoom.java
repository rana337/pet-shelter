package model;

import java.util.ArrayList;

public class ExaminationRoom {
    private int Id;
    public ArrayList<Integer> AvilableSlots=new ArrayList<Integer>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
