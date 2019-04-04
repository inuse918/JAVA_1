import java.util.*;
public class methodpractice1_4 {
	public int pandan(int a) {
		return a;
	}
public static void main(String[] args) {
	methodpractice1_4 t1_4=new methodpractice1_4();
			Scanner sc= new Scanner(System.in);
			System.out.print("짝수홀수 판단할 수 입력 : ");
	
	if (t1_4.pandan(sc.nextInt())%2==0){
		System.out.println("짝수입니다. ");
	}
	else {
		System.out.println("홀수입니다. ");
	}
}
}