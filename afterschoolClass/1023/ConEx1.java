class A{
	public A() {
		System.out.println("������ A");
	}
}
class C extends B{
	public C(){		
		System.out.println("������ C");
	}
}
class B extends A{
	public B(){		
		System.out.println("������ B");
	}
}
public class ConEx1 {
	public static void main(String[] args) {
		C c=new C();
	}
}
