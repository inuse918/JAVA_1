import java.util.*;

class self3 {
	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : " );
		Scanner korean = new Scanner(System.in);
		int korean1 = korean.nextInt(); 
		System.out.print("���� ������ �Է��ϼ��� : " );
		Scanner english = new Scanner(System.in);
		int english1 = english.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : " );
		Scanner math = new Scanner(System.in);
		int math1 = math.nextInt();

		int total = 0;
		float average = 0;
		
		total = korean1 + english1 + math1;
		average = total / 3;

		System.out.println("�� �� : " + total);
		System.out.println("��� : " + average);


	}
}