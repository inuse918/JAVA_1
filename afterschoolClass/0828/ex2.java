import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է�(��, ���� �Է½� ����)");
		Scanner sc=new Scanner(System.in);
		int you=0;
		int sum=0;
		do {
			System.out.println("���� ������ �Է��ϼ���: ");
			you=sc.nextInt();
			
			if (you%2==0) {
				sum+=you;
			}
			
		} while(you>0);
		System.out.println("�Է��� �� �߿� ���� ������ ���� "+ sum + " �Դϴ�.");
		

	}

}
