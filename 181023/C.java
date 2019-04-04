class A{
	public A(){
		System.out.println("생성자 A");
	}
	A(int x){
		System.out.println("매개변수생성자 A");
	}
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
	public B(int y){
		//super();
		super (y);
		System.out.println("매개변수생성자 B");
	}	
}
class C{
	public static void main(String[] args){
		B b = new B(5);
	}
}

// 부모의 기본생성자 자동 실행(super 없을 때)