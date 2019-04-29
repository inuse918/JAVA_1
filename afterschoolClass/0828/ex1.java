import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		System.out.println("등수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int sco=sc.nextInt();
		
		switch(sco) {
		case 1: System.out.println("아주 잘했습니다."); break;
		case 2:case 3: System.out.println("잘 했습니다."); break;
		case 4:case 5:case 6: System.out.println("보통입니다"); break;
		default:System.out.println("노력하세요."); break;
		}
			

	}

}
