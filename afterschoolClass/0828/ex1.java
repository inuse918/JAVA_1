import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		System.out.println("����� �Է��ϼ���");
		Scanner sc=new Scanner(System.in);
		int sco=sc.nextInt();
		
		switch(sco) {
		case 1: System.out.println("���� ���߽��ϴ�."); break;
		case 2:case 3: System.out.println("�� �߽��ϴ�."); break;
		case 4:case 5:case 6: System.out.println("�����Դϴ�"); break;
		default:System.out.println("����ϼ���."); break;
		}
			

	}

}
