import java.util.Scanner;

public class Bees_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bees�� �Է��ϼ��� : ");
		String bee=sc.next();
		
		int i=1;
		String Bees="Bees";

		if (bee.equals(Bees))
		{
			while (i<=5)
			{
				System.out.println("Bees");
				i++;
			}
		}
		else {
			System.out.println("Bees�� �ƴմϴ�. �ٽ� �Է��� �ּ���. ");
		}
	}
}