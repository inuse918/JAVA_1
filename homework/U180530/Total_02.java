import java.util.Scanner;

public class Total_02 {
	public static void main(String[] args) {
		
		//n, m을 입력 받아 n부터 m까지 짝수의 합, 홀수의 합  (두 개 비교까지)

		Scanner user=new Scanner(System.in);
		System.out.println("[입력한 두 수 사이의(두 수 포함) 홀수 짝수 합 구하기]");
		System.out.print("숫자를 입력하세요 : ");
		int n=user.nextInt();
		System.out.print("숫자를 하나 더 입력하세요 : ");
		int m=user.nextInt();
		
		int big=0;
		int small=0;

		if (n>m){
			big = n;
			small = m;
		}
		else if (m>n)
		{
			big = m;
			small = n;
		}
		else {
			System.out.println("입력하신 두 수가 같습니다. ");
		}
		
		int evenTotal=0;
		int oddTotal=0;

		while (big>=small)
		{
			if (small%2==0)
			{
				evenTotal+=small;
			}
			else {
				oddTotal+=small;
			}
			small++;
		}

		System.out.println("짝수의 합 : " + evenTotal + " 이고, 홀수의 합 : " + oddTotal + " 입니다.");

	} //main
}