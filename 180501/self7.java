import java.util.*;

class self7 {
	public static void main(String[] args){
		System.out.println("게임을 종료하시겠습니까?");
		System.out.println("1을 누르면 종료, 0을 누르면 계속");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1){
			System.out.println("종료");
		}
		if(i==0){
			System.out.println("계속");
		}
	}
}