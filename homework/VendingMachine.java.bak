import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		/*					자판기
			----------------------------------------
			1. 콜라(600) 2.커피(300) 3.물(500) 4.보리차(700)
			----------------------------------------
					금액을 입력하세요:2000
					음료를 선택하세요:1
			-----------------------------------------
				뽑으신 음료늠 콜라이며 거스름돈은 1400원입니다.
				1000원:1 500원:0 100원:4 10원:0
			-----------------------------------------
					추가선택하시겠습니까? (y/n)*/

		System.out.println("\t\t자판기");
		System.out.println("-------------------------------------------------------------");
		System.out.print("1. 콜라(600)  | 2. 커피(300)  | 3. 물(500)  | 4. 보리차(700)  \n");
		System.out.println("-------------------------------------------------------------");

		int coke=600; int coffee=300; int water=500; int boriTea=700;
		String coke2="콜라"; String coffee2="커피"; String water2="물"; String boriTea2="보리차"; 
		String choice2=""; String choice="";
		int money2=0; int change=0; int count=1; int money=0; int drink=0;
		Scanner sc=new Scanner(System.in);

		do{
			
			if (count==1)
			{
				count++;
				System.out.print("\t금액을 입력하세요 : ");
				money=sc.nextInt();
				System.out.print("\t음료를 선택하세요(번호 입력) : ");
				drink=sc.nextInt();
			}
			else {
				System.out.println("     남은 금액 : " + change);
				money=change;
				System.out.print("\t음료를 선택하세요(번호 입력) : ");
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
			default: System.out.println(drink +" 번은 없는 메뉴 입니다. 처음부터 다시 선택해 주세요.");
					System.exit(0);
			}
			if (money<money2)
			{
				System.out.println("        잔액이 부족해ㅠ");
				System.exit(0);
			}

			change=money-money2;
			System.out.println("--------------------------------------");
			System.out.println("\t뽑으신 음료는 " + choice + "입니다.");
			System.out.println("\t거스름돈은 " + (change) + "원 입니다.");
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
			
			System.out.println("1000원 : " + thou + " 장 | 500원 : " + hun5 + " 개 | 100원 : " + hun +" 개 | 10원 : " + ten);



			System.out.println("------------------------------------");
			System.out.print("  추가선택하시겠습니까? (y or n) : \n");
			choice2=sc.next();
			System.out.println("------------------------------------");
			

		} while(choice2.equalsIgnoreCase("y"));
		System.exit(0);

			
		
	

		
	}//main
}