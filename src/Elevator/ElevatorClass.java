package Elevator;

import java.util.Random;

public class ElevatorClass{
	//���� ������ Ŭ����
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
		String[] elevatorName = {"1ȣ��", "2ȣ��", "3ȣ��"};
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
			int a = Math.abs(ELEVATORS[i]-currentFloor);  // ���밪�� ���Ѵ�.
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
			System.out.println("�����");
}   

	public void goingUp(int newFloor, int currentFloor) {
		if(currentFloor < newFloor){ //�ö�
			System.out.println("�ö󰩴ϴ�.");
            for (int i = currentFloor; i <= newFloor; i++)
              	System.out.println("..." + i);
            System.out.println("��! �����߽��ϴ�.");
	}
}
	public void goingDown(int newFloor, int currentFloor) {	
		if (currentFloor > newFloor) { //������;
			System.out.println("�������ϴ�.");
             for (int i = currentFloor; i >= newFloor; i--)
             	System.out.println("..." + i);
            System.out.println("��! �����߽��ϴ�.");
}
}
}