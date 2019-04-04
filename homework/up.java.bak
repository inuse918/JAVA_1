 import java.util.*;

//180618 까지
//selection sort
public class up {
	public static void main(String[] args) {
		System.out.print("정수를 5개 입력하세요 : ");
		Scanner sc = new Scanner (System.in);

		int a[];
		a = new int[5];
		int b, max=0;

		for (b=0;b<a.length ;b++ ) {
			a[b] = sc.nextInt();
			//System.out.print(a[b]);
		}
		for (int i=0;i<a.length ;i++ ) {
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					max = a[i];
					a[i] = a[j];
					a[j]=max; 
				}
			} System.out.print(a[i]+" ");
		}
		
		
	}
}