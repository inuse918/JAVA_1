class A{
	public A(){
		System.out.println("������ A");
	}
	A(int x){
		System.out.println("�Ű����������� A");
	}
}
class B extends A{
	B(){
		System.out.println("������ B");
	}
	public B(int y){
		//super();
		super (y);
		System.out.println("�Ű����������� B");
	}	
}
class C{
	public static void main(String[] args){
		B b = new B(5);
	}
}

// �θ��� �⺻������ �ڵ� ����(super ���� ��)