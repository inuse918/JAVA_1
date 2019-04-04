abstract class Person30 {
	String name;
	int age;

	public void go() {
		System.out.println("가다.");
	}

	abstract public void walk();
	abstract public int count(int num); //인원수
}

abstract class child extends Person30 {
	public void walk() {
		System.out.println("걷기 싫은데?");
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
		System.out.println(c2.count(3)+"명이 있다.");
		c2.go();
	}
}