class Rectangle{
	private int x1,y1,x2,y2;

	public Rectangle (int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public void set(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public Rectangle(){
	}

	int square() {
		int x,y;
		if (x1-x2<0){
			x=x1-x2;
			x*=-1;
		} else {
			x=x1-x2;
		}
		if (y1-y2<0){
			y=y1-y2;
			y*=-1;
		} else {
			y=y1-y2;
		}
		return x*y;
	}

	void show() {
		System.out.println("(x1,y1) = ("+x1+","+y1+") 이고 (x2,y2) = ("+x2+","+y2+") 이다.");
		System.out.println("넓이 : "+square());
	}

	boolean equals (Rectangle r) {
		if (this==r) return true;
		else return false;
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle s=new Rectangle(1,1,2,3);
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))	System.out.println("두 사각형은 같습니다. ");
	}// main
}