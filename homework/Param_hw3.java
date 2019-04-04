public class Param_hw3 {
	public static void main(String[] args) {
		//5. 5개의 매개변수 입력받아 최대값, 최소값 출력
		
		int y[]=new int[5];
		
		for (int i=0;i<y.length;i++)
		{
			y[i]=Integer.parseInt(args[i]);
		}

		int big=y[0],sma=y[0];

		for (int i=0;i<y.length;i++)
		{
			if (y[i]>big)
			{
				big=y[i];
			}
			else {
				sma=y[i];
			}
		}
		System.out.println("최대값 : "+big+" 최소값 : "+sma);
		
		
		
	}	
}