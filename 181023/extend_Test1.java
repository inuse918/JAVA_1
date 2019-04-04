class extend_Test1 {
	public static void main(String[] args){
		Student8 s=new Student8("Mike",30);
		Player8 p=new Player8("Baseball",25);
		s.eat("밥");
		s.eat("국");
		System.out.println(s.name+"은(는)"+s.age+"쨜!");
		System.out.println(p.name+"은(는)"+p.age+"쨜!");
	}
}