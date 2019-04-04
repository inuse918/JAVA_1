class Student3 {
	private String name,grade;

	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}

	public void setGrade(String s) {
		grade=s;
	}
	public String getGrade() {
		return grade;
	}


}

class S_Test{
	public static void main(String[] args){
		Student3 s1=new Student3();
		s1.setName("Tom");
		System.out.println(s1.getName());

		s1.setGrade("1");
		System.out.println(s1.getGrade());
	}

}
