import java.util.Scanner;

public class RoScPa {
	public static void main (String[] args) {
		//����������
		String Rock = "����";
		String Scissor = "����";
		String Paper1 = "��";

		System.out.println("���� ���� �� ������ �Ұ̴ϴ�. ���� ���� ���� �Է��ϼ���. ");
		Scanner sc=new Scanner(System.in);
		System.out.print("ä�� | ");
		String me = sc.next();
		System.out.print("�� | ");
		String sam = sc.next();
		//String na = "ä��";
		//String you = "��";
		//String result="";

		if (me.equals("����"))
		{
			switch (sam)
			{
				case "����": System.out.println("�����ϴ�."); break;
				case "����": System.out.println("ä���̰� �����ϴ�."); break;
				case "��": System.out.println("ä���̰� �̰���ϴ�."); break;
			}
			//if (sam.equals("����"))
			//{
			//	result = you;
			//}
			//else if (sam.equals(""))
			//{
			/}
		}   
		else if (me.equals("����")) {
			switch (sam)
			{
				case "����": System.out.println("ä���̰� �̰���ϴ�."); break;
				case "����": System.out.println("�����ϴ�."); break;
				case "��": System.out.println("ä���̰� �����ϴ�"); break;
			} 
		}
		else if (me.equals("��")) {
			switch (sam)
			{
				case "����": System.out.println("ä���̰� �����ϴ�."); break;
				case "����": System.out.println("ä���̰� �̰���ϴ�."); break;
				case "��": System.out.println("�����ϴ�."); break;
			}
		}
		else {
			System.out.println("���� ���� ���� �Է��� �ּ���.");
		}
			
	}//main
}