
public class Circle {
	private void secret() {
		System.out.println("����̴�.");
	}
	protected void findRadius() {
		System.out.println("�������� 10.0��Ƽ�̴�.");
	}
	public void findArea() {
		System.out.println("������ (����*������*������)�̴�.");
	}
}

class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color=color;
	}
	public void findColor() {
		System.out.println(color+" ���̴�.");
	}
	public void findArea() {
		System.out.println("���̴� 4*(����*������*������)�̴�.");
	}
	public void find
	
}
