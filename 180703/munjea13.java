public class munjea13 {
	public static void main(String[] args){
		//13. 100이하의 자연수n을 입력받아 1부터n까지의 평균을 출력하는 프로그램을 작성하시오.
		int a=Integer.parseInt(args[0]);
		float sum=0;
		int i,count=0;
		if (a>100){
			System.out.println("100보다 큰 정수입니다. 다시 입력해 주세요.");
			System.exit(0);
		}
		for (i=1;i<=a;i++){
			sum+=i;
			count++;
		}
		System.out.println("평균은 "+(float)sum/count);
	}
}