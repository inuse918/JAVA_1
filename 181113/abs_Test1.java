abstract class Person30 {
	String name;
	int age;

	public void go() {
		System.out.println("����.");
	}

	abstract public void walk();
	abstract public int count(int num); //�ο���
}

abstract class child extends Person30 {
	public void walk() {
		System.out.println("�ȱ� ������?");
	}
}

class child2 extends child{
	public int count(int num){
		return num;
	}
}

class abs_Test1{
	public static void main(String[] args){

		child2 c2=new child2();
		c2. walk();
		System.out.println(c2.count(3)+"���� �ִ�.");
		c2.go();
	}
}