package Elevator;
import java.util.Scanner;

public class ElevatorMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ElevatorClass eC = new ElevatorClass();
		int newFloor;
		int currentFloor;
		
		//엘베 랜덤 값;
		eC.showElevators();
		//현재 층;
		System.out.println("현재 층을 입력하세요: ");
		currentFloor = in.nextInt();
        //가까운 엘리베이터 호출;
		eC.nearElevator(currentFloor);
		//층 선택, 1~15층 이 외에는 에러
		System.out.println("가고 싶은 층을 선택 하세요(1~15) ==> ");
        newFloor = in.nextInt();
        //가까운 엘리베이터 선택
        int nearElevator = eC.nearElevator(currentFloor);
        System.out.println("현재층은 "+currentFloor+"층입니다.\n"
        +currentFloor+"층에서 가까운 "+nearElevator+"층에 있는 엘리베이터를 호출합니다.");
        //층 선택,
        eC.selectElevator(newFloor, currentFloor);
        eC.goingUp(newFloor, currentFloor);
        eC.goingDown(newFloor, currentFloor);
}
}



