
public class ReturnDemo {

	public static void main(String[] args) {
		printScore(99);
		printScore(6);

	}
	
	public static void printScore(int score) {
		if(score>100||score<0) {
			System.out.println("잘못된 점수 : "+score);
			return;
		}
		
			System.out.println("점수 : "+score);

	}

}
