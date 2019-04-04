public class Vehicle_Test extends Vehicle {
	
	public String start(int x){
		x=10;
		System.out.println(x+"km 의 속도로 출발합니다. ");
		for(int i=0; i<=100;i+=10){
			System.out.println("속도 증가 + "+i);
			x+=i;
		}
		return x+"속도로 달리고 있습니다."
	}
	public int stop(String x){
		x=90;
		System.out.println(x+"km/h 의 속도로 달리다가 사고가 났습니다. ");
		for(int i=x; i>0;i-10){
			System.out.println("속도 감소 - "+i);
			x-=10;
		}
		return x;s
	}
	public String take(){
		System.out.println("타기 시러잉");
		return "꺼져";
	}
}