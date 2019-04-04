class Truck extends Car {
	private int loadage;
	private int luggage;
	public Truck(String name, int displacement, int loadage){
		super(name,displacement);
		this.loadage=loadage;
	}
	public Truck(){}

	public void setLoadage(int loadage){
		this.loadage=loadage;
	}
	public int getLoadage(){
		return loadage;
	}	

	public void klaxon(){
		System.out.println("¶ì¶ì~");
		System.out.println("»§»§!");
		System.out.println("»Ñ¿Í¾Ó–Ø¾Ó!!");
	}
	public void setLuggage(int luggage){
		this.luggage+=luggage;
	}
	public int getLuggage(){
		return luggage;
	}
}