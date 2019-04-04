public class Tv_Test {
	public static void main(String[] args) {
		
		Tv t=new Tv();

		t.Brand="LG";
		t.price=300;
		t.height=1.1F;
		t.weight=4.3F;

		System.out.println(t.Brand+"이라는 브랜드의 TV의 가격은 "+t.price+"만 원이고, 높이는 "+t.height+"m, 무게는 "+t.weight+"kg 입니다.");
		System.out.println("이 TV가 하는 일은 ?");

		t.show();
		t.onoff();
		t.stop();
	}
}