import java.util.*;

class self23 {
	public static void main(String[] args) {
		int total = 0;
		double average = 0;
		double c3 = 0;
		double c4 = 0;
		System.out.println("두 개의 정수를 입력하세요 : ");
			
				Scanner i = new Scanner(System.in);
				int i1 = i.nextInt();
				int i2 = i.nextInt();
			
				if (i1<i2)
				{
					for (int c = i1+1;c<i2 ;c++ )
					{
						if ((c%3==0) || (c%5==0))
						{
							total =  total + c;
							c3++;
						}
					}
				}
				if (i1>i2)
				{
					for (int c1 = i2+1;c1<i1 ;c1++ )
					{
						if ((c1%3==0)||(c1%5==0))
						{
							total =  total + c1;
							c4++;
						}
					}
				}
					
			
			average = total/(c3+c4);
			System.out.println("당신이 입력한 정수 중 3의 배수나 5의 배수의 합은 " + total + "이고, 평균은 " + average + " 입니다.");
	}
}