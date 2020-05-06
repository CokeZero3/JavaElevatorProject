package elevatorProject;

import java.util.Scanner;

public class exe {
	static int elevator1 = ((int) (Math.random() * 15 + 1));
	static int elevator2 = ((int) (Math.random() * 15 + 1));
	static int elevator3 = ((int) (Math.random() * 15 + 1));
	static int inputFloor = 0;
	
	static void nearElevator(int inputFloor)throws InterruptedException {
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
		); 
         }
            System.out.println(inputFloor+"층에 도착하였습니다.");
            System.out.println("탑승하세요."); break;
        }
        }

	
	public static void main(String[] args) throws InterruptedException{
		Scanner in = new Scanner(System.in);
			
		System.out.println("========================================");
		System.out.println("-------1호기-------2호기-------3호기-------");
		System.out.println("\t"+elevator1+"\t"+"   "+elevator2+"\t"+"      "+elevator3);
		System.out.println("========================================");
		System.out.print("현재 층을 입력하세요: ");
		inputFloor = in.nextInt();
		nearElevator(inputFloor);
		
		}
}
