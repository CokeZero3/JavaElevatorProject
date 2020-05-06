package elevatorProject;

import java.util.Scanner;

/*
 * 우리 학원의 엘레베이터는 3개이다
 * 그런데 근처에 있는 엘레베이터는 움직이지 않고
 * 가장 아래있는 엘레베이터가 움직인다
 * 알고리즘을 고쳐보자.
 * 
 * 변수: 
 * 건물
 * 4 단계
 * 1. 정지 상태에선 콜이 있는 방향으로 움직인다.
 * 2. 움직이는 방향과 동일한 방향을 향하는 콜에서 멈춘다.
 * 3. 둘째 단계를 만족하면 방향을 바꿔 움직인다.
 * 4. 마지막 콜이 만족하면 멈춤. 
 * 
 * 구조
 *  1. 엘레베이터 방향
 *  2. 현재 위치
 *  3. 속도
 *  4. 승객 태울 수 있는 정도 
 */


public class elevatorOperation01 {
    static int floor = 0, choice1, person = 0;

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;
		floor = ((int) (Math.random() * 10 + 1));

        System.out.println("The elevator is now on floor " +floor);
        System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
        choice = in.nextInt();

        if(floor == choice1)
        {
            System.out.println("Enter the elevator");
        }

        else if(floor > choice1)
        {
            ElevatorDown();
        }

        else if(floor < choice1)
        {
            ElevatorUp();
        }

        System.out.println("To which floor would you want to go (0-10) where 0 = basement");
        choice = in.nextInt();

        if(floor > choice1)
        {
            ElevatorDown();
        }

        else if(floor < choice1)
        {
            ElevatorUp();
        }

    }

    public static void ElevatorUp()
    {
        System.out.println("The elevator is on it's way up...");

        for (person = choice1; choice1>=floor; floor++)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }

    public static void ElevatorDown()
    {
        System.out.println("The elevator is on it's way down...");
        for (person = choice1; choice1<=floor; floor--)

            System.out.println(floor);

        System.out.println("The elevator has arrived");
    }	
	}
