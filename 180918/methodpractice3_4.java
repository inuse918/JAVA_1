import java.util.*;
public class methodpractice3_4 {
	public int zero(int a) {
		return a;
	}
	public static void main(String[] args) {
		methodpractice3_4 t3_4=new methodpractice3_4 ();
		Scanner sc = new Scanner(System.in);
		if (t3_4.zero(sc.nextInt())<0){
			System.out.println("음수입니다. ");
		}
		else {
			System.out.println("양수입니다. ");
		}
	}
}