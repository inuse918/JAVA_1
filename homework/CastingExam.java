class Car{
	String name = "��";
	String print(){
		return "[���� "+name+"�̴�.]";
	}
}
class Bus extends Car{
	String name="����";
	String print(){
		return "[���� ������ "+name+"�̴�.]";
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