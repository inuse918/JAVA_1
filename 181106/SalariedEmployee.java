class SalariedEmployee extends Employee {
	double salary;

	public SalariedEmployee(String name,String num,double salary) {
		super(name,num);
		this.salary=salary;
	}
	public SalariedEmployee(String name,String num){
		super(name,num);
	}

	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public double computeSalary(){
		return salary*12;
	}
	public String toString(){
		return super.toString()+" [ПљБо] "+computeSalary();
	}	
	
}