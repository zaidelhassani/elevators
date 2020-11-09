package com.sqli.test.elevators;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private int numberOfFloors;
    List<Elevator> elevatorList = new ArrayList<Elevator>();

    public Building(int numberOfFloors, String... ids) {
    this.numberOfFloors = numberOfFloors;

    for (String id:ids) {
        String[] s = id.split(":");
        elevatorList.add(new Elevator(Integer.parseInt(s[1]), s[0]));
    }

    }

    public String requestElevator(int i) {

        int minCurrentFloor = 10;
        String id = "";

        for (Elevator elevator : elevatorList) {
            if ((elevator.getElevatorCurrentFloor() - i) < 0) {
                int val = i - elevator.getElevatorCurrentFloor();
                if (val <= minCurrentFloor) {
                    minCurrentFloor = val;
                    id = elevator.getId();
                }
            }
            else {
                int val = i - elevator.getElevatorCurrentFloor();
                if (val <= minCurrentFloor) {
                    minCurrentFloor = val;
                    id = elevator.getId();
                }
            }


        }
        return id;

    }

    public String requestElevator() {

        int maxCurrentFloor = 0;
        String id = "";

        for (Elevator elevator : elevatorList) {
            if (elevator.getElevatorCurrentFloor() > maxCurrentFloor) {
                maxCurrentFloor = elevator.getElevatorCurrentFloor();
                id = elevator.getId();
            }
        }

        return id;
    }

    public void move(String id2, String down) {
        for (Elevator elevator : elevatorList) {
            if (elevator.getId().equals(id2)) {
                if (down.equals("DOWN")) {
                    elevator.setElevatorCurrentFloor(1);
                }
                if (down.equals("UP")) {
                    elevator.setElevatorCurrentFloor(10);
                }
            }

        }

    }

    public void stopAt(String id3, int i) {
        for (Elevator elevator : elevatorList) {
            if (elevator.getId().equals(id3)) {
                elevator.setElevatorCurrentFloor(i);
            }
        }
    }
}
