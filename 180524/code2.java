import java.util.Scanner;

public class code2 {
	public static void main(String[] args){

		System.out.print(" �� ���� ������ �Է��ϼ���. (��, ù ��° �Է��ϴ� �� < �� ��° �Է��ϴ� ��) : ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		System.out.print(n+"��(��)"+n2+"����("+n+","+n2+"����)5�� ����� ������");
		while (n<=n2)
		{
			if (n%5==0)
			{
				count++;
			}
			n++;
		}
		System.out.println(count+ "�� �Դϴ�");
	}
}