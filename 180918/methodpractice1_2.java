import java.util.*;
public class methodpractice1_2 {
	public void pandan(int a){
		if (a%2==0){
			System.out.println("¦���Դϴ�. ");
		}
		else {
			System.out.println("Ȧ���Դϴ�. ");
		}
	}

	public static void main(String[] args){
		methodpractice1_2 t1_2=new methodpractice1_2();
			Scanner sc= new Scanner(System.in);
			System.out.print("¦��Ȧ�� �Ǵ��� �� �Է� : ");
			t1_2.pandan(sc.nextInt());
	}
}