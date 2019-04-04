import java.util.*;

class self3 {
	public static void main(String[] args) {
		System.out.print("국어 점수를 입력하세요 : " );
		Scanner korean = new Scanner(System.in);
		int korean1 = korean.nextInt(); 
		System.out.print("영어 점수를 입력하세요 : " );
		Scanner english = new Scanner(System.in);
		int english1 = english.nextInt();
		System.out.print("수학 점수를 입력하세요 : " );
		Scanner math = new Scanner(System.in);
		int math1 = math.nextInt();

		int total = 0;
		float average = 0;
		
		total = korean1 + english1 + math1;
		average = total / 3;

		System.out.println("총 합 : " + total);
		System.out.println("평균 : " + average);


	}
}