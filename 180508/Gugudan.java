import java.util.*;

class Gugudan {
	public static void main(String[] args){
		System.out.print("�ϰ���� ��(���ڷ�) : " );
		Scanner g = new Scanner(System.in);
		int g1 = g.nextInt();

		System.out.println(g1 + "��");
		
		for (int g2=1;g2<=9 ;g2++)
		{
			System.out.println(g1 + "*" + g2 + "=" + (g1*g2));
		}

		
	}
}