class Employee {
	private String name, hiredate;
	private int salary;

	public Employee (String name, int salary, String hiredate) {
		this.name=name;
		this.hiredate=hiredate;
		this.salary=salary;
	}
	public Employee (String name, String hiredate) {
		this.name=name;
		this.hiredate=hiredate;
	}
	public Employee (int salary, String hiredate) {
		this.salary=salary;
		this.hiredate=hiredate;
	}
	public Employee (String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	public void setHiredate(String h){
		hiredate=h;
	}
	public int getSalary(){
		return salary;
	}
	public static void main(String[] args) {
	Employee e1=new Employee("Mike",100,"2018-03-01");
	Employee e2=new Employee("Alice",2017-03-02);
	Employee e3=new Employee(300,"2016-05-03");
	Employee e4=new Employee("Tomas",500);

	e2.setHiredate("2002-09-18");
	System.out.println(e4.getSalary());
	}
}