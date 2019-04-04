class Car{
	String name = "차";
	String print(){
		return "[나는 "+name+"이다.]";
	}
}
class Bus extends Car{
	String name="버스";
	String print(){
		return "[차의 종류는 "+name+"이다.]";
	}
}
class CastingExam{
	public static void main(String[] args){
		Car mycar, yourcar;
		Bus mybus,yourbus;
		Truck mytruck,yourtruck;
		mycar=new Car();
		mybus =new Bus();
	}
}