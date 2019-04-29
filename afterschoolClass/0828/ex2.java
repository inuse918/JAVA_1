import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		System.out.println("양의 정수 입력(단, 음수 입력시 종료)");
		Scanner sc=new Scanner(System.in);
		int you=0;
		int sum=0;
		do {
			System.out.println("양의 정수를 입력하세요: ");
			you=sc.nextInt();
			
			if (you%2==0) {
				sum+=you;
			}
			
		} while(you>0);
		System.out.println("입력한 수 중에 양의 정수의 합은 "+ sum + " 입니다.");
		

	}

}
