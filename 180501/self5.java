import java.util.*;

class self5 {
	public static void main(String[] args) {
		System.out.print("100 ������ ������ �Է��ϼ��� : " );
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("100 ������ ������ �ϳ� �� �Է��ϼ��� : ");
		Scanner sc1 = new Scanner(System.in);
		int i1 = sc.nextInt();
		
			if(i<=i1) {
				for(int a = i; a<=i1 ; a++){
					System.out.println(a);
				}
			} 
			else if(i>=i1) {
				for(int b = i1; b<=i ; b++){
					System.out.println(b);
				}
			} 
			else if(i>100) {
				System.out.println("100 ������ ������ �Է��ϼ���.");
			}
			else if(i1>100) {
				System.out.println("100 ������ ������ �Է��ϼ���.");
			}
	}
}