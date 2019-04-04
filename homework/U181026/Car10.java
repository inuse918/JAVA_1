class Car10{
	String carname, color;
	int velocity;
	public Car10(String color){
		super(color);
		this.color=color;
	}
	public void speedUp(){
		velocity+=5;
	}
	public void speedDown(){
		velocity-=5;
	}
}