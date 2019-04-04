class Shape {
	private int width, height;

	public Shape(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public void setWidth(int w){
		width=w;
		System.out.println(width);
	}
	public void setHeight(int h){
		height=h;
		System.out.println(height);
	}

	public double getArea(double a, double b){
		return a*b;
	}
	public double getArea(int c, int d){
		return c*d;
	}
	
	public static void main(String[] args){
		Shape s1=new Shape(3,5);
		Shape s2=new Shape(6,2);

		s1.setWidth(9);
		s2.setHeight(10);

		System.out.println(s1.getArea(5,10)/2);
		System.out.println(s2.getArea(6.3,6.9));
	}
}