import java.util.*;

class self10 {
	public static void main(String[] args) {
		int t=0;
		int b=0;
		for (int a=100;a<=999 ;a++ )
		{
			if (a%7==0)
			{
				t=a+t;
				b++;
			}
				
		}
		System.out.println("7의 배수의 합은 " + t + "입니다.");
		System.out.println("7의 배수의 개수는 " + b + "개 입니다.");
	}
}