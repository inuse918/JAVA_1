import java.util.Scanner;

public class SellerManager {
	final int Max_Cnt =100;
	FruitSeller[] infosave=new FruitSeller[Max_Cnt];
	int nowCnt=0;
	
	Scanner inpu=new Scanner(System.in);
	public void inputData() {
		System.out.println();
		System.out.println("**�����͸� �Է��ϼ���***");
		System.out.println("���� �̸� | ");
		String name=inpu.next();
		System.out.println("��� ���� | ");
		int numOfApple=inpu.nextInt();
		System.out.println("��� ���� | ");
		int applePrice=inpu.nextInt();
		System.out.println("���� �ڱ� | ");
		int myMoney=inpu.nextInt();
		
		infosave[nowCnt++]=new FruitSeller(name, numOfApple, applePrice, myMoney);
		System.out.println("**������ �Է� �Ϸ�**");
	}
	public void showData() {
		System.out.println();
		if(nowCnt==0) {
			System.out.println("!!�Էµ� �ڷᰡ �����ϴ�!!");
		}
		else {
			for(int i=0;i<nowCnt;i++) {
				infosave[i].showSellerInfo();
			}
		}
		System.out.println("<���� ��ϵ� �Ǹ��� ���� "+nowCnt+ " �� �Դϴ�.>");
	}
}
