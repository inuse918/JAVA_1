import java. util.*;

public class methodpractice3_2 {
	public void zero(int a) {
		if (a<0){
			System.out.println("�����Դϴ�. ");
		}
		else {
			System.out.println("����Դϴ�. ");
		}
	}

	public static void main(String[] args) {
		methodpractice3_2 t3_2=new methodpractice3_2();
		Scanner sc=new Scanner (System.in);
		System.out.print("����������� �˰���� �� �Է�: ");
		t3_2.zero(sc.nextInt());
	}
}