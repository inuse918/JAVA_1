import java.util.*;

class self22 {
	public static void main(String[] args) {
		System.out.println("10���� ������ �Է��ϼ���");
		int even=0;
		int odd=0;
			for (int a=1;a<=10 ;a++ )
			{
				Scanner ten = new Scanner(System.in);
				int ten1 = ten.nextInt();
					if (ten1%2==0)
					{
						
						even++;
					}
					else
					{
						
						odd++;
					}

			}
			System.out.println("����� �Է��� ���� �� Ȧ���� ������ " + odd + " ��, ¦���� ������ " + even + " �� �Դϴ�.");
			
	}
}