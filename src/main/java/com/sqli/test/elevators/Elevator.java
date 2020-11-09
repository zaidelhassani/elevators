package com.sqli.test.elevators;

public class Elevator {

    private int elevatorCurrentFloor;
    private String id;

    public Elevator(int elevatorCurrentFloor, String id) {
        this.elevatorCurrentFloor = elevatorCurrentFloor;
        this.id = id;
    }

    public int getElevatorCurrentFloor() {
        return elevatorCurrentFloor;
    }

    public void setElevatorCurrentFloor(int elevatorCurrentFloor) {
        this.elevatorCurrentFloor = elevatorCurrentFloor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
