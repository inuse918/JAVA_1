class person1 {
	String name;
	int age;
	
	public void eat() {
		System.out.println("��ô��ô");
	}
	public void go() {
		System.out.println("��������");
	}
}


class person1_Test {

	public static void main(String[] args) {
		
		person1 p1=new person1();
		p1.name="Mike";
		p1.age=30;

		System.out.println("�̸� : "+p1.name+" ���� : "+p1.age);
		p1.eat();
		p1.go();
	
		person1 p2=new person1();
		p2.name="Tom";
		p2.age=25;
		
		System.out.println("�̸� : "+p2.name+" ���� : "+p2.age);

		p2.eat();
		p2.go();
	}
}
