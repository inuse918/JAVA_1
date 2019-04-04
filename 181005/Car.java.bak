class Car {
	private String brand, owner, company;
	private int price;

	public Car(String brand, String owner, String company, int price) {
		this.brand=brand;
		this.owner=owner;
		this.company=company;
		this.price=price;
	}
	public Car(String owner,String company,int price) {
		this.owner=owner;
		this.company=company;
		this.price=price;
	}
	public Car(String owner, int price){
		this.owner=owner;
		this.price=price;
	}
	public String start(String where) {
		return where;
	}
	public String stop(String when) {
		return when;
	}

	public static void main(String[] args) {
		Car c1=new Car("sonata","mike","hyundae",210);
		Car c2=new Car("Alice","kia",300);
		Car c3=new Car("Tom",350);
		Car c4=new Car("Benz","Tomas","mk",500);
		
		System.out.println(c3.owner+"의 차는 "+c3.price+" 만 원 입니다.");
		 System.out.println(c4.start("서울역역")+"에서 출발했더니 "+c4.stop("15시에")+" 도착했습니다.");
	}
}