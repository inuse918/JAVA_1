public class munjea14 {
	public static void main(String[] args){
		//14. 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.
		int even=0,odd=0;
		int a[]=new int[10];
		for (int i=0;i<10;i++){
			a[i]=Integer.parseInt(args[i]);
			if (a[i]%2==0){
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("짝수의 개수는 " +even+" 개, 홀수의 개수는 "+odd+" 개 입니다.");
	}
}