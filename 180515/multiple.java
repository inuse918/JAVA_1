import java.util.*;

public class multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하고싶은 단 입력 : ");
		int i = sc.nextInt();
		
		int j = 1;
		while (j<=9)
		{
			System.out.println(i + "*" + j + "=" + (i*j));
			j++;
		}
	}
}