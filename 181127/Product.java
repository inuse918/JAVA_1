class Product  {
	private String id,info,maker;
	int price;

	public Product (String id, String info, String maker, int price){
		this.id=id;
		this.info=info;
		this.maker=maker;
		this.price=price;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return info;
	}
	public void setMaker(String maker){
		this.maker=maker;
	}
	public String getMaker(){
		return maker;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}

	public void show(){
		System.out.println("================================================");
		System.out.println("[ID] : "+getId());
		System.out.println("[Information] : "+getInfo());
		System.out.println("[Maker] : "+getMaker());
		System.out.println("[Price] : "+getPrice());
		System.out.println("================================================");
	}
	
}