import java.util.*;

class self4 {
	public static void main(String[] args) {

		System.out.print("10 이하의 자연수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<=10) {
			for(int b = 1; b<=a; b++){
				System.out.println("freeze");
			}
		}
		else {
			System.out.println("10 이하의 값만 입력하세요.");
			return;
		}
	}
}