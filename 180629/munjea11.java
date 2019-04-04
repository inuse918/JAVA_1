public class munjea11{
	public static void main(String[] args) {
		//11. 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int big=0,small=0;
		
		if (a>100||b>100){
			System.out.println("100 이하의 정수를 입력하세요.");
			return;
		}
		else {
			if (a>=b){
				big=a;
				small=b;
			}
			else {
				big=b;
				small=a;
			}
			for (int i=small;i<=big;i++){
				System.out.println(i);
			}
		}
			

	}
}