class Test9{
	int a;
	int b;

	public Test9(int a,int b){
		this(a);
		this.b=40;
	}
	public Test9(int a){
		this();
	}
	public Test9(){
		this.a=20;
	}

	public static void main(String[] args){
		Test9 t=new Test9(10,20);

		System.out.println("this()È£Ãâ");
	}
}
// 16, 17, 5, 6, 9, 10, 12, 13, 7, 19