import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("정수 두 개를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("두 수의 곱은" + a*b + "입니다.");

	}

}
