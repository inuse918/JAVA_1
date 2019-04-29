
class NamedCircle extends Circle{
	String name;
	NamedCircle(int radius,String name){
		super(radius);
		this.name=name;
	}
	
	void show() {
		System.out.println(name+", ¹ÝÁö¸§ = "+getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w=new NamedCircle(5,"Waffle");
		w.show();
	}
}
