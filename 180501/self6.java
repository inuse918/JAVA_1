import java.util.*;

class self6 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : " );
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int t = 0;
				for (int i = 1;i<=a ;i++ )
				{
					if (i%5==0)
					{
						t = t+i;
					}

				}
				System.out.println(t);
				

	}
}