import java.util.*;

public class munjea6 {
	public static void main(String[] args) {
		//6. 10 ������ �ڿ��� n�� �Է¹޾� "Daniel"�� n�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc=new Scanner(System.in);
		int n[]=new int[1];
		System.out.print("10 ������ �ڿ����� �Է��ϼ��� : ");
		n[0]=sc.nextInt();
		if (n[0]>10)
		{
			System.out.println("10 ������ �ڿ����� �Է��ϼ���.");
			return;
		}
		for (int i=1;i<=n[0];i++){
			System.out.println("Daniel");
		}
	}
}