class Shape{
	public void draw(){
		System.out.println("�����׸���");
	}
	public void painting(){
	System.out.println("�θ� ��ĥ�ϱ�");
	}
}
class circle extends Shape{
	public void draw(){
		System.out.println("���׸���");
	}
	public void painting(){
		System.out.println("��ĥ�ϱ�");
	}
}

class casting_Test2{
	public static void main(String[] args){
		Shape s=new Shape();
		s.draw();
		s.painting(); //compile errors

		circle c1=new circle();
		c1.draw(); // "���׸���"
		c1.painting(); // "��ĥ�ϱ�"

		Shape s2=c1; // upcasting
		s2.draw(); // "���׸���"
		s2.painting()
	}
}