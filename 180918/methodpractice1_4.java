import java.util.*;
public class methodpractice1_4 {
	public int pandan(int a) {
		return a;
	}
public static void main(String[] args) {
	methodpractice1_4 t1_4=new methodpractice1_4();
			Scanner sc= new Scanner(System.in);
			System.out.print("¦��Ȧ�� �Ǵ��� �� �Է� : ");
	
	if (t1_4.pandan(sc.nextInt())%2==0){
		System.out.println("¦���Դϴ�. ");
	}
	else {
		System.out.println("Ȧ���Դϴ�. ");
	}
}
}