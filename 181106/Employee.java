class Employee {
	String name, num;

	public Employee (String name, String num){
		this.name=name;
		this.num=num;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public String toString(){
		return "[�̸�] "+name+" [��ȣ] "+num;
	}
}