class Box {
	//가로, 세로, 높이를 멤버변수로 갖는 클래스
	int width;
	int length;
	int height;
	
}


public class BoxTest {
	public static void main(String[] args) {
		
		Box b=new Box();
		
		b.width=20;
		b.length=20;
		b.height=20;
		
		System.out.println("가로는 "+b.width+" 세로는 "+b.length+" 높이는 "+b.height);
	}
}
