class Smartphone extends Phone{
	String OS,memory,cam,bluetooth;
	int ver;

	public Smartphone(String manufacturer,int price,String type,String OS,int ver,String memory,String cam,String bluetooth){
		super(manufacturer,price,type);
		this.OS=OS;
		this.cam=cam;
		this.ver=ver;
		this.bluetooth=bluetooth;
	}
	public String toString(){
		return "[제조자] "+manufacturer+"\n[가격] "+price+"만 원\n[타입] "+type+"\n[운영체제] "+OS+"\n[버전] "+ver+"\n[메모리] "+memory+"\n[카메라장착여부] "+cam+"\n[블루투스] "+bluetooth;
	}
}