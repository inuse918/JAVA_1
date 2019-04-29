
public class FruitSeller {
	int applePrice;
	int myMoney;
	int numOfApple;
	String name;
	
	public FruitSeller(String name, int numOfApple, int applePrice, int myMoney) {
		this.name=name;
		this.numOfApple=numOfApple;
		this.applePrice=applePrice;
		this.myMoney=myMoney;
	}
	public void showSellerInfo() {
		System.out.println("[가게 이름]  "+name);
		System.out.println("[판매 수익]  "+myMoney);
		System.out.println("[사과 가격]  "+applePrice);
		System.out.println("[남은 사과]  "+numOfApple);
		System.out.println();
	}
	
}
