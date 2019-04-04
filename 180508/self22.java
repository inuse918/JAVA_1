import java.util.*;

class self22 {
	public static void main(String[] args) {
		System.out.println("10개의 정수를 입력하세요");
		int even=0;
		int odd=0;
			for (int a=1;a<=10 ;a++ )
			{
				Scanner ten = new Scanner(System.in);
				int ten1 = ten.nextInt();
					if (ten1%2==0)
					{
						
						even++;
					}
					else
					{
						
						odd++;
					}

			}
			System.out.println("당신이 입력한 정수 중 홀수의 개수는 " + odd + " 개, 짝수의 개수는 " + even + " 개 입니다.");
			
	}
}