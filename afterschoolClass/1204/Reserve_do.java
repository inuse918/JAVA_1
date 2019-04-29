
public class Reserve_do {
	public Reserve_do (String name, String telephone, int seatNum) {
		this.name=name;
		this.telephone=telephone;
		this.seatNum=seatNum;
	}
	private String name,telephone;
	private int seatNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public void show() {
		System.out.println("[좌석번호] : "+getSeatNum());
		System.out.println("[예매자명] : "+getName());
		System.out.println("[예매자 전화번호] :"+getTelephone());
	}
	
}
