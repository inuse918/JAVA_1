import java.util.Scanner;

public class SellerManager {
	final int Max_Cnt =100;
	FruitSeller[] infosave=new FruitSeller[Max_Cnt];
	int nowCnt=0;
	
	Scanner inpu=new Scanner(System.in);
	public void inputData() {
		System.out.println();
		System.out.println("**데이터를 입력하세요***");
		System.out.println("가게 이름 | ");
		String name=inpu.next();
		System.out.println("사과 개수 | ");
		int numOfApple=inpu.nextInt();
		System.out.println("사과 가격 | ");
		int applePrice=inpu.nextInt();
		System.out.println("보유 자금 | ");
		int myMoney=inpu.nextInt();
		
		infosave[nowCnt++]=new FruitSeller(name, numOfApple, applePrice, myMoney);
		System.out.println("**데이터 입력 완료**");
	}
	public void showData() {
		System.out.println();
		if(nowCnt==0) {
			System.out.println("!!입력된 자료가 없습니다!!");
		}
		else {
			for(int i=0;i<nowCnt;i++) {
				infosave[i].showSellerInfo();
			}
		}
		System.out.println("<현재 등록된 판매자 수는 "+nowCnt+ " 명 입니다.>");
	}
}
