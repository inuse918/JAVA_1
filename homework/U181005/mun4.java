import java.util.*;
class mun4 {
	public int Add(int a, int b) {
		int result=0;
		result=a+b;
		return result;
	}
	public int Sub(int a, int b) {
		int result=0;
		if (a>=b){
			result=a-b;
		}
		else {
			result=b-a;
		}
		return result;
	}
	public int Mul(int a,int b){
		int result=0;
		result=a*b;
		return result;
	}
	public int Div( int a,int b) {
		int result=0;
		result=a/b;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		mun4 m=new mun4();
		System.out.println("���� �� �� �Է�");
		System.out.println("�����? " +m.Add(sc.nextInt(),sc.nextInt()) );
		System.out.println("�� �� �� �Է�(ū �� ���� ���� ���� �����ϴ�)");
		System.out.println("�����? " +m.Sub(sc.nextInt(),sc.nextInt()) );
		System.out.println("���� �� �� �Է�");
		System.out.println("�����? " +m.Mul(sc.nextInt(),sc.nextInt()) );
		System.out.println("���� �� �� �Է� (�������� �߸��ϴ�)");
		System.out.println("�����? " +m.Div(sc.nextInt(),sc.nextInt()) );
		
	}
}