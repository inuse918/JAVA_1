public class While_01 {
	public static void main(String[] args) {
		//1~5 합 구하기
		int sum=0;
		int i=1;

		while (i<=5)
		{
			sum+=i;
			i++;
			
		}
			System.out.println("1~5의 합은 " + sum + " 입니다.");
	}
}
