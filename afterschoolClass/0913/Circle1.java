
public class Circle1 {
	int radius;
	String name;
	public double getArea() {
		return 3.14*radius*radius;
	}
public Circle1() {
	radius=1;
	name="";
}
public Circle1(int r,String n) { //���ϴ����� ����, Ŭ���� �̸��� ����.
	radius=r;
	name=n;
}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1();
		pizza.radius=1;
		pizza.name="�Ұ������";
		
		System.out.println(pizza.name+" �� ������ " + pizza.getArea());
		
		Circle1 donut = new Circle1(10,"��Ų����");
		System.out.println(donut.name+" �� ������ "+donut.getArea());
	}
}
