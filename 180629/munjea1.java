import java.util.*;

public class munjea1 {
	public static void main(String[] ar) {
		//1. ���� 5���� �Է� �޾Ƽ� ¦��, Ȧ���� �հ� ���.
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int even=0,odd=0;
		System.out.println("=���� 5���� �Է��ϼ���=");
		for (int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if (a[i]%2==0){
				even+=a[i];
			}
			else{
				odd+=a[i];
			}
		}
		System.out.println("¦���� �� : "+even+" Ȧ���� �� : "+odd);
		
	}		
}