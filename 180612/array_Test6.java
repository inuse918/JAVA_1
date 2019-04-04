import java.util.*;

public class array_Test6 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		System.out.print("정수 다섯 개 입력 : ");
		int i[];
		i = new int[5];

		for(int a=0;a<i.length;a++) {
			i[a] = sc.nextInt();
		} //for1

		int min = i[0];
		int max = i[0];

		for (int b=0;b<i.length ;b++ )
		{
			if (min>i[b]) {
				min = i[b];
			}

			if (max<i[b]) {	
				max = i[b];
			}
		} //for2	
		

	
		System.out.println("가장 큰 수 : " + max + " 가장 작은 수 : " + min);
	} //main
}