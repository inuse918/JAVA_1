class Person7{
	String name;
	int age, height;

	Person7(String n,int h){
		this(h);
		this.name;
	}
	Person7(String name, int age, int height){
		this(name,height);
		this.age=age;
	}
	Person7(int x){
		this();
		this.name="Tom";
	}
	Person7(){
		this.height=130;
	}
	public static void main(String[] args){
		Person7 p=new Person7("Mike",30,180);
	}
}