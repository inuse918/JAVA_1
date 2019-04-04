class Television implements Buyable{
	private int price;
	private String maker,model;

	public Television(String model, String maker,int price){
		this.model=model;
		this.price=price;
		this.maker=maker;
	}
	public Television(){
	}
	
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
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
}