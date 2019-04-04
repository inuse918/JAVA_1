import java.util.*;

public class array_Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--10개의 정수 입력--");
		
		int i[] = new int[10];

		for (int cou = 0 ; cou<i.length ; cou++ )
		{
			int k = sc.nextInt();
				if (i[cou]%3==0)
				{
					System.out.println(i);
				}
				
				
		}

		
		
		
	}
}