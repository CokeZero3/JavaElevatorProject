package elevatorProject;

import java.util.Scanner;

public class Elevator {
    public static int currentFloor;

    public Elevator() {
        currentFloor = 0;
    }

    public static void selectFloor() {
        Scanner in = new Scanner(System.in);
        int newFloor;

        System.out.println("가고 싶은 층을 선택 하세요 ==> ");
        newFloor = in.nextInt();
        if (newFloor > 15 && newFloor < 0 || newFloor == 13) {
            System.out.println("Invalid selection");
        }

        else if (newFloor <= 15 && newFloor > 0 && newFloor != 13) {
            for (int i = 1; i <= newFloor; i++)
                System.out.println("..." + i);
                System.out.println("Ding!");
                backToBasement(newFloor);
        }
    }
    public static void backToBasement(int newFloor){
        for (int i=newFloor; i>0;i--){
             System.out.println("..." + i);
        }
        System.out.println("Ding!... Back to Ground Level");

    }
	public static void main(String[] args) {
		selectFloor();
		
	}
}
