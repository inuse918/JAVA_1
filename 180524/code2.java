import java.util.Scanner;

public class code2 {
	public static void main(String[] args){

		System.out.print(" 두 개의 정수를 입력하세요. (단, 첫 번째 입력하는 수 < 두 번째 입력하는 수) : ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		System.out.print(n+"와(과)"+n2+"사이("+n+","+n2+"포함)5의 배수의 개수는");
		while (n<=n2)
		{
			if (n%5==0)
			{
				count++;
			}
			n++;
		}
		System.out.println(count+ "개 입니다");
	}
}