import java.util.*;

class self11 {
	public static void main(String[] args) {
		int t=0;
		int a=0;
		for (int i=100;i<=999 ;i++ )
		{
			if (i%4!=0)
			{
				t=t+i;
				a++;
			}
		}
		System.out.println("4의 배수가 아닌 수의 합은 " + t + "입니다.");
		System.out.println("4의 배수가 아닌 수의 개수는 " + a + "개 입니다.");
	}
}