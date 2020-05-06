package elevatorProject;

import java.util.Scanner;

/*
 * �츮 �п��� ���������ʹ� 3���̴�
 * �׷��� ��ó�� �ִ� ���������ʹ� �������� �ʰ�
 * ���� �Ʒ��ִ� ���������Ͱ� �����δ�
 * �˰����� ���ĺ���.
 * 
 * ����:
 * 1. currentFloor //������
 * 2. inputFloor //�Է��� ��
 * 3. //����ڰ� �Է��� �ִ� ��
 * 4. �ö󰡰� ��������
 */


public class elevatorOperation2 {
	static int elevator1 = ((int) (Math.random() * 15 + 1));
	static int elevator2 = ((int) (Math.random() * 15 + 1));
	static int elevator3 = ((int) (Math.random() * 15 + 1));
	
	static void nearElevator(int inputFloor) {
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
		); break;
          }
        }
 }  

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputFloor = 0;
	
		
        System.out.println("���������� ȣ��: ");
		inputFloor = in.nextInt();
		nearElevator(inputFloor);
		
    		
	}
}
