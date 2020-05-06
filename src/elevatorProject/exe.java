package elevatorProject;

import java.util.Scanner;

public class exe {
	static int elevator1 = ((int) (Math.random() * 15 + 1));
	static int elevator2 = ((int) (Math.random() * 15 + 1));
	static int elevator3 = ((int) (Math.random() * 15 + 1));
	static int inputFloor = 0;
	
	static void nearElevator(int inputFloor)throws InterruptedException {
		Scanner in = new Scanner(System.in);
		//1. ����� �� ã�� �ʱ�ȭ �� ����
		int[] data = {elevator1, elevator2, elevator3};
		int min = Integer.MAX_VALUE;    // ���ص����� �ּҰ� - Interger���� �ִ밪���� ���� �ִ´�.
		int nearData = 0;               // ����� ���� ������ ����
				
		//2. Process
        for(int i=0;i<data.length;i++){
            int a = Math.abs(data[i]-inputFloor);  // ���밪�� ���Ѵ�.
            if(min > a){
                   min = a;
                   nearData = data[i];
                   
        System.out.println("1ȣ��� ���� "+elevator1+"���� �ֽ��ϴ�.\n"+
				   "2ȣ��� ���� "+elevator2+"���� �ֽ��ϴ�.\n"+
				   "3ȣ��� ���� "+elevator3+"���� �ֽ��ϴ�.\n"+
				   inputFloor+"������ ���� ������ "+nearData+"������ ȣ���߽��ϴ�."  
		); 
         }
            System.out.println(inputFloor+"���� �����Ͽ����ϴ�.");
            System.out.println("ž���ϼ���."); break;
        }
        }

	
	public static void main(String[] args) throws InterruptedException{
		Scanner in = new Scanner(System.in);
			
		System.out.println("========================================");
		System.out.println("-------1ȣ��-------2ȣ��-------3ȣ��-------");
		System.out.println("\t"+elevator1+"\t"+"   "+elevator2+"\t"+"      "+elevator3);
		System.out.println("========================================");
		System.out.print("���� ���� �Է��ϼ���: ");
		inputFloor = in.nextInt();
		nearElevator(inputFloor);
		
		}
}
