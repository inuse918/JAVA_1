import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		/*					���Ǳ�
			----------------------------------------
			1. �ݶ�(600) 2.Ŀ��(300) 3.��(500) 4.������(700)
			----------------------------------------
					�ݾ��� �Է��ϼ���:2000
					���Ḧ �����ϼ���:1
			-----------------------------------------
				������ ����� �ݶ��̸� �Ž������� 1400���Դϴ�.
				1000��:1 500��:0 100��:4 10��:0
			-----------------------------------------
					�߰������Ͻðڽ��ϱ�? (y/n)*/

		System.out.println("\t\t���Ǳ�");
		System.out.println("-------------------------------------------------------------");
		System.out.print("1. �ݶ�(600)  | 2. Ŀ��(300)  | 3. ��(500)  | 4. ������(700)  \n");
		System.out.println("-------------------------------------------------------------");

		int coke=600; int coffee=300; int water=500; int boriTea=700;
		String coke2="�ݶ�"; String coffee2="Ŀ��"; String water2="��"; String boriTea2="������"; 
		String choice2=""; String choice="";
		int money2=0; int change=0; int count=1; int money=0; int drink=0;
		Scanner sc=new Scanner(System.in);

		do{
			
			if (count==1)
			{
				count++;
				System.out.print("\t�ݾ��� �Է��ϼ��� : ");
				money=sc.nextInt();
				System.out.print("\t���Ḧ �����ϼ���(��ȣ �Է�) : ");
				drink=sc.nextInt();
			}
			else {
				System.out.println("     ���� �ݾ� : " + change);
				money=change;
				System.out.print("\t���Ḧ �����ϼ���(��ȣ �Է�) : ");
				drink=sc.nextInt();
			}
			

			switch (drink)
			{
			case 1: choice=coke2;
					money2=coke;
					break;
			case 2: choice=coffee2;
					money2=coffee;
					break;
			case 3: choice=water2;
					money2=water;
					break;
			case 4: choice=boriTea2;
					money2=boriTea;
					break;
			default: System.out.println(drink +" ���� ���� �޴� �Դϴ�. ó������ �ٽ� ������ �ּ���.");
					System.exit(0);
			}
			if (money<money2)
			{
				System.out.println("        �ܾ��� �����ؤ�");
				System.exit(0);
			}

			change=money-money2;
			System.out.println("--------------------------------------");
			System.out.println("\t������ ����� " + choice + "�Դϴ�.");
			System.out.println("\t�Ž������� " + (change) + "�� �Դϴ�.");
			int thou=0; int hun=0; int ten=0; int hun5=0;
			thou = change/1000; 
			change-=thou*1000;
			hun5 = change/500;
			change-=hun5*500;
			hun = change/100;
			change-=hun*100;
			ten = change/10;
			change-=ten/10;

			change=(thou*1000) + (hun5*500) + (hun*100) + (ten*10);
			
			System.out.println("1000�� : " + thou + " �� | 500�� : " + hun5 + " �� | 100�� : " + hun +" �� | 10�� : " + ten);



			System.out.println("------------------------------------");
			System.out.print("  �߰������Ͻðڽ��ϱ�? (y or n) : \n");
			choice2=sc.next();
			System.out.println("------------------------------------");
			

		} while(choice2.equalsIgnoreCase("y"));
		System.exit(0);

			
		
	

		
	}//main
}