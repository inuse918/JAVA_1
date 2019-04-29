
public class Circle {
	int radius;
	void set(int r) {
		radius=r;
	}
	double getarea() {
		return 3.14*radius*radius;
	}
	//public Circle() {} //default »ý¼ºÀÚ
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.set(5);
	}
}
