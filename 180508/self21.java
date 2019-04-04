import java.util.*;

class self21 {
	public static void main(String[] args) {
		System.out.println("100 이하의 정수(n)를 입력하세요 : ");
		Scanner n = new Scanner(System.in);
		int n1 = n.nextInt();
		
		if (n1<=100)
		{
			double total = 0;
			
			System.out.println(n1+"을 입력하셨습니다." +n1+" 개 만큼의 정수를 enter키를 사용 해 또 입력해 주세요.");
				
			for (int a=1;a<=n1;a++)
			{
				int t1 = n.nextInt();
				total = t1 + total;
			}
			total = (double)total/n1 ;
			System.out.println("당신이 입력한 값의 평균은 " + total + " 입니다. ");
		}
		else 
		{
			System.out.println("100 이하의 정수를 입력하세요. ");
		}
	}
}