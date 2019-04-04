class Animal {
	private String name, owner;
	private int leg;

	public Animal(String name, String owner, int leg) {
		this.name=name;
		this.owner=owner;
		this.leg=leg;
	}
	public Animal(String name,String owner){
		this.name=name;
		this.owner=owner;
	}
	public Animal(String owner,int leg){
		this.owner=owner;
		this.leg=leg;
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void setOwner(String o){
		owner=o;
	}
	public String getOwner(){
		return owner;
	}
	public static void main(String[] args) {
		Animal a1=new Animal("cat","mike",4);
		Animal a2=new Animal("dog","alice");
		Animal a3=new Animal("tom",3);	 

		a3.setName("Sheep");
		a2.setOwner("tomas");
		System.out.println(a3.getName());
		System.out.println(a2.getOwner());

	}
}