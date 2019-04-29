
class ColorPoint extends Point{
	String color;
	int x,y;
	ColorPoint (int x,int y,String color){
		super(x,y);
		this.color=color;
	}
	void setPoint(int x,int y) {
		move(x,y);
	}
	void setColor(String color) {
		this.color=color;
	}
	String getColor() {
		return color;
	}
	void show() {
		System.out.println(getColor()+"������("+getX()+","+getY()+")");
	}
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
	}
}
