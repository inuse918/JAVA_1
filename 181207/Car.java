class Car {
	private String name;
	private int displacement;

	public Car(String name, int displacement){
		this.name=name;
		this.displacement=displacement;
	}
	public Car(){}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setDisplacement(){
		this.displacement=displacement;
	}
	public int getDisplacement(){
		return displacement;
	}
	public void klaxon(){
		System.out.println("���~");
		System.out.println("����!");
		System.out.println("�ѿ;Ӗؾ�!!");
	}
}