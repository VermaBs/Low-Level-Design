package test;

import classes.ElevatorCar;
import classes.Request;
import enums.Direction;
import enums.Location;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        final ElevatorCar elevator = ElevatorCar.getElevatorCar();

        Request upRequest1 = new Request(elevator.getCurrentFloor(), 5, Direction.UP, Location.INSIDE_ELEVATOR);
        Request upRequest2 = new Request(elevator.getCurrentFloor(), 3, Direction.UP, Location.INSIDE_ELEVATOR);

        Request downRequest1 = new Request(elevator.getCurrentFloor(), 1, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest2 = new Request(elevator.getCurrentFloor(), 2, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest3 = new Request(4, 0, Direction.DOWN, Location.OUTSIDE_ELEVATOR);

        // Two people inside of the elevator pressed button to go up to floor 5 and 3.
        elevator.sendUpRequest(upRequest1);
        elevator.sendUpRequest(upRequest2);
        elevator.startElevatorCar();

        // One person outside of the elevator at floor 4 pressed button to go down to floor 0
        elevator.sendDownRequest(downRequest3);

        // Two person inside of the elevator pressed button to go down to floor 1 and 2.
        elevator.sendDownRequest(downRequest1);
        elevator.sendDownRequest(downRequest2);


        elevator.startElevatorCar();
    }
}
