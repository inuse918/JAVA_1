
public class ReturnDemo {

	public static void main(String[] args) {
		printScore(99);
		printScore(6);

	}
	
	public static void printScore(int score) {
		if(score>100||score<0) {
			System.out.println("�߸��� ���� : "+score);
			return;
		}
		
			System.out.println("���� : "+score);

	}

}
