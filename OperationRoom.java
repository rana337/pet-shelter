package model;

import java.util.ArrayList;

public class OperationRoom {
    private int roomNumber;
    private ArrayList<String> slots;

    public OperationRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        this.slots = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<String> getSlots() {
        return slots;
    }

    public void addSlot(String slot) {
        slots.add(slot);
    }

    public void removeSlot(String slot) {
        slots.remove(slot);
    }
}
