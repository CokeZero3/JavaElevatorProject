package Elevator;
import java.util.Scanner;

public class ElevatorMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ElevatorClass eC = new ElevatorClass();
		int newFloor;
		int currentFloor;
		
		//���� ���� ��;
		eC.showElevators();
		//���� ��;
		System.out.println("���� ���� �Է��ϼ���: ");
		currentFloor = in.nextInt();
        //����� ���������� ȣ��;
		eC.nearElevator(currentFloor);
		//�� ����, 1~15�� �� �ܿ��� ����
		System.out.println("���� ���� ���� ���� �ϼ���(1~15) ==> ");
        newFloor = in.nextInt();
        //����� ���������� ����
        int nearElevator = eC.nearElevator(currentFloor);
        System.out.println("�������� "+currentFloor+"���Դϴ�.\n"
        +currentFloor+"������ ����� "+nearElevator+"���� �ִ� ���������͸� ȣ���մϴ�.");
        //�� ����,
        eC.selectElevator(newFloor, currentFloor);
        eC.goingUp(newFloor, currentFloor);
        eC.goingDown(newFloor, currentFloor);
}
}



