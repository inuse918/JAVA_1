
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
		System.out.println("[���� �̸�]  "+name);
		System.out.println("[�Ǹ� ����]  "+myMoney);
		System.out.println("[��� ����]  "+applePrice);
		System.out.println("[���� ���]  "+numOfApple);
		System.out.println();
	}
	
}
