package com.example.donor333;
import model.OperationRoom;

import java.time.LocalDateTime;

public class Operation_Slots {
    private OperationRoom operationRoom;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isAvailable;
    public Operation_Slots(OperationRoom operationRoom, LocalDateTime startTime, LocalDateTime endTime) {
        this.operationRoom = operationRoom;
        this.startTime = startTime;

        this.endTime = endTime;
        this.isAvailable = true;
    }

    // Getters and setters for properties

    public OperationRoom getOperationRoom() {
        return operationRoom;
    }

    public void setOperationRoom(OperationRoom operationRoom) {
        this.operationRoom = operationRoom;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Other methods

    public void bookSlot() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void cancelBooking() {
        if (!isAvailable) {
            isAvailable = true;
        }
    }

    }


