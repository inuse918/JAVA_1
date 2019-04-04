import java.util.*;

public class methodpractice4_2 {
	public void add(int a,int b){
		int s=0;
		int big=0;
		int small=0;
		if (a>b)	{
			big=a;
			small=b;
		}
		else if (a<b)	{
			big=b;
			small=a;
		}
		for (int i=small;i<=big;i++){
			s+=i;
		}
		System.out.println(a+" 부터 "+ b +" 까지의 합은 "+ s + "입니다.");
	}

public static void main(String[] args) {
	methodpractice4_2 t4_2=new methodpractice4_2();
	Scanner sc= new Scanner (System.in);
	System.out.print("a 부터 b 까지의 합 (a와 b입력): ");
	int c=sc.nextInt();
	int d=sc.nextInt();
	t4_2.add(c,d);

}
}