
public class Increment {

	public static void main(String[] args) {
		int x=0;
		System.out.println("�޼ҵ带 ȣ���ϱ� �� x�� " +x);
		increment (x);
		System.out.println("�޼ҵ带 ȣ���� ���� x�� " +x);
		increment(x);
	}
	
	public static void increment(int n) {
		System.out.println("�޼ҵ� ������ ���� n�� " + n);
		n++;
		System.out.println("�޼ҵ� ���� �� n��"+n);
	}

}