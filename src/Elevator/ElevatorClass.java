package Elevator;

import java.util.Random;

public class ElevatorClass{
	//변수 가능한 클래스
	String result = "";
	int[] ELEVATORS = new int[3];
	public ElevatorClass(int size) {
		ELEVATORS = new int[size];
	}
	public ElevatorClass() {
		this(3);
	}
	
	
	public void showElevators() {
		Random random = new Random();
		String[] elevatorName = {"1호기", "2호기", "3호기"};
		result = "";
		for (int i = 0; i<ELEVATORS.length; i++) {
			ELEVATORS[i] = random.nextInt(15)+1;
			result += (elevatorName[i]+":"+ELEVATORS[i]+"\n");	
		}
		System.out.println(result);
	}
	public int nearElevator(int currentFloor) {
		int nearElevator = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<ELEVATORS.length;i++){
			int a = Math.abs(ELEVATORS[i]-currentFloor);  // 절대값을 취한다.
			if(min > a){
				min = a;
				nearElevator = ELEVATORS[i];
	}
	}
		return nearElevator;
}
	public void selectElevator(int newFloor, int currentFloor) {
		if (newFloor > 15 || newFloor < 0) {
    	    System.out.println("Invalid");
    		}else if  (newFloor == currentFloor);
			System.out.println("대기중");
}   

	public void goingUp(int newFloor, int currentFloor) {
		if(currentFloor < newFloor){ //올라감
			System.out.println("올라갑니다.");
            for (int i = currentFloor; i <= newFloor; i++)
              	System.out.println("..." + i);
            System.out.println("띵! 도착했습니다.");
	}
}
	public void goingDown(int newFloor, int currentFloor) {	
		if (currentFloor > newFloor) { //내려감;
			System.out.println("내려갑니다.");
             for (int i = currentFloor; i >= newFloor; i--)
             	System.out.println("..." + i);
            System.out.println("띵! 도착했습니다.");
}
}
}