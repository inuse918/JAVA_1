class person_Test {
	public static void main(String[] args) {
		
	person p1=new person();
	p1.name="Mike";
	p1.age=30;

	System.out.println("�̸� : "+p1.name+" ���� : "+p1.age);
	p1.eat();
	p1.go();

	person p2=new person();
	p2.name="Tom";
	p2.age=25;

	System.out.println("�̸� : "+p2.name+" ���� : "+p2.age);

	p2.eat();
	p2.go();
	}
}