import java.util.*;

class self23 {
	public static void main(String[] args) {
		int total = 0;
		double average = 0;
		double c3 = 0;
		double c4 = 0;
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
			
				Scanner i = new Scanner(System.in);
				int i1 = i.nextInt();
				int i2 = i.nextInt();
			
				if (i1<i2)
				{
					for (int c = i1+1;c<i2 ;c++ )
					{
						if ((c%3==0) || (c%5==0))
						{
							total =  total + c;
							c3++;
						}
					}
				}
				if (i1>i2)
				{
					for (int c1 = i2+1;c1<i1 ;c1++ )
					{
						if ((c1%3==0)||(c1%5==0))
						{
							total =  total + c1;
							c4++;
						}
					}
				}
					
			
			average = total/(c3+c4);
			System.out.println("����� �Է��� ���� �� 3�� ����� 5�� ����� ���� " + total + "�̰�, ����� " + average + " �Դϴ�.");
	}
}