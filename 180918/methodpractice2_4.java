import java.util.*;

public class methodpractice2_4 {
	public int result(int b){
		if (b<0){
			return b*-1;
		}
		else return b;
	
	}
	public static void main(String[] args) {
		methodpractice2_4 t2_4=new methodpractice2_4();
		Scanner sc=new Scanner(System.in);
		System.out.print("절댓값을 구할 수 입력 : ");
		int a=sc.nextInt();
		System.out.println("절댓값은 "+t2_4.result(a));
	}
}