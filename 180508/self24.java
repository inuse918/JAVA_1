import java.util.*;

public class self24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하고싶은 단의 숫자 입력: ");
		int i = sc.nextInt();

		System.out.println(i + "단");
		
		for (int i1=1;i1<=9 ;i1++)
		{
			System.out.println(i + "*" + i1 + "=" + (i*i1));
		}
	}
}