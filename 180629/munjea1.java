import java.util.*;

public class munjea1 {
	public static void main(String[] ar) {
		//1. 정수 5개를 입력 받아서 짝수, 홀수별 합계 출력.
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int even=0,odd=0;
		System.out.println("=정수 5개를 입력하세요=");
		for (int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if (a[i]%2==0){
				even+=a[i];
			}
			else{
				odd+=a[i];
			}
		}
		System.out.println("짝수의 합 : "+even+" 홀수의 합 : "+odd);
		
	}		
}