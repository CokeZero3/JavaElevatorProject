package elevatorProject;

import java.util.Scanner;

/*
 * 우리 학원의 엘레베이터는 3개이다
 * 그런데 근처에 있는 엘레베이터는 움직이지 않고
 * 가장 아래있는 엘레베이터가 움직인다
 * 알고리즘을 고쳐보자.
 * 
 * 변수:
 * 1. currentFloor //현재층
 * 2. inputFloor //입력한 층
 * 3. //사용자가 입력한 있는 층
 * 4. 올라가고 내려가는
 */


public class elevatorOperation2 {
	static int elevator1 = ((int) (Math.random() * 15 + 1));
	static int elevator2 = ((int) (Math.random() * 15 + 1));
	static int elevator3 = ((int) (Math.random() * 15 + 1));
	
	static void nearElevator(int inputFloor) {
		Scanner in = new Scanner(System.in);
		//1. 가까운 수 찾기 초기화 및 선언
		int[] data = {elevator1, elevator2, elevator3};
		int min = Integer.MAX_VALUE;    // 기준데이터 최소값 - Interger형의 최대값으로 값을 넣는다.
		int nearData = 0;               // 가까운 값을 저장할 변수
				
		//2. Process
        for(int i=0;i<data.length;i++){
            int a = Math.abs(data[i]-inputFloor);  // 절대값을 취한다.
            if(min > a){
                   min = a;
                   nearData = data[i];
            
		System.out.println("1호기는 현재 "+elevator1+"층에 있습니다.\n"+
				   "2호기는 현재 "+elevator2+"층에 있습니다.\n"+
				   "3호기는 현재 "+elevator3+"층에 있습니다.\n"+
				   inputFloor+"층에서 가장 근접한 "+nearData+"층에서 호출했습니다."  
		); break;
          }
        }
 }  

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputFloor = 0;
	
		
        System.out.println("엘리베이터 호출: ");
		inputFloor = in.nextInt();
		nearElevator(inputFloor);
		
    		
	}
}
