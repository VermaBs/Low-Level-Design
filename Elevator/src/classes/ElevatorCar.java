package classes;

import java.util.TreeSet;

import enums.Direction;
import enums.Location;
import enums.State;

public class ElevatorCar {
	private int currentFloor;
	private State carState; 
	private Direction currentDirection;
	private TreeSet<Request> upQueue ;
	private TreeSet<Request> downQueue;
	private static ElevatorCar car;
	
	private ElevatorCar() {
		super();
		this.currentFloor=0;
		this.carState=State.IDLE;
		this.currentDirection=Direction.UP;
		upQueue = new TreeSet<>((a, b) -> a.desiredFloor - b.desiredFloor);
        downQueue =  new TreeSet<>((a, b) -> b.desiredFloor - a.desiredFloor);
	}
	
	public static ElevatorCar getElevatorCar() {
		if(car==null) car=new ElevatorCar();
		return car;
	}
	
	public void sendUpRequest(Request upRequest) throws InterruptedException {
		if(upRequest.location ==Location.OUTSIDE_ELEVATOR) {
            // Go pick up the requester who is outside of the elevator
			upQueue.add(new Request(upRequest.currentFloor,
	                upRequest.currentFloor,
	                Direction.UP,
	                Location.OUTSIDE_ELEVATOR));
			 Thread.sleep(3000);
		     System.out.println("Append up request going to floor " + upRequest.currentFloor + ".");
		}
		 // Go to the desired floor,below case handle when Location is Location.INSIDE_ELEVATOR
        upQueue.add(upRequest);
        Thread.sleep(3000);
        System.out.println("Append up request going to floor " + upRequest.desiredFloor + ".");
			
	}
	public void sendDownRequest(Request downRequest) throws InterruptedException {
		
		 if (downRequest.location == Location.OUTSIDE_ELEVATOR) {
	            downQueue.add(new Request(downRequest.currentFloor,
	                downRequest.currentFloor,
	                Direction.DOWN,
	                Location.OUTSIDE_ELEVATOR));
	            Thread.sleep(3000);
	            System.out.println("Append down request going to floor " + downRequest.currentFloor + ".");
	        }

	        // Go to the desired floor
	        downQueue.add(downRequest);
	        Thread.sleep(3000);
	        System.out.println("Append down request going to floor " + downRequest.desiredFloor + ".");

	}
	
	 public void startElevatorCar() throws InterruptedException {
	        while (!upQueue.isEmpty() || !downQueue.isEmpty()) {
	            processRequests();
	        }

	        System.out.println("Finished all requests.");
	        this.currentDirection = Direction.IDLE;
	    }

   private void processRequests() throws InterruptedException {
	        if (this.currentDirection == Direction.UP || this.currentDirection == Direction.IDLE) {
	            processUpRequest();
	            processDownRequest();
	        } else {
	            processDownRequest();
	            processUpRequest();
	        }
	}
	private void processDownRequest() throws InterruptedException {
	// TODO Auto-generated method stub
		  while (!upQueue.isEmpty()) {
	            Request upRequest = upQueue.pollFirst();
	            this.currentFloor = upRequest.desiredFloor;
	            Thread.sleep(3000);
	            System.out.println("Processing up requests. Elevator stopped at floor " + this.currentFloor + ".");
	        }
		  while (!downQueue.isEmpty()) {
	            Request downRequest= downQueue.pollFirst();
	            this.currentFloor = downRequest.desiredFloor;
	            Thread.sleep(3000);
	            System.out.println("Processing up requests. Elevator stopped at floor " + this.currentFloor + ".");
	        }
		  
    }

	private void processUpRequest() throws InterruptedException {
	// TODO Auto-generated method stub
		 while (!downQueue.isEmpty()) {
	            Request downRequest = downQueue.pollFirst();
	            this.currentFloor = downRequest.desiredFloor;
	            Thread.sleep(3000);
	            System.out.println("Processing down requests. Elevator stopped at floor " + this.currentFloor + ".");
	        }
	        if (!upQueue.isEmpty()) {
	            this.currentDirection = Direction.UP;
	        } else {
	            this.currentDirection = Direction.IDLE;
	        }
   }

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public Direction getDirection() {
		return currentDirection;
	}


	public void setDirection(Direction direction) {
		this.currentDirection = direction;
	}

	public State getCarState() {
		return carState;
	}

	public void setCarState(State carState) {
		this.carState = carState;
	}

	
	
}
