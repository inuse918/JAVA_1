interface Movable{
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}

class Vehicle{
	int speed;
	public Vehicle(){
	};
	public Vehicle(int speed){
		this.speed=speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public int getSpeed(){
		return speed;
	}
}

class car extends Vehicle implements Movable{
	String carNum;
	
	public car(String carNum,int speed){
		super(speed);
		this.carNum=carNum;
	}		
	public  void speedUp(int amount){
		if(speed>120){
			System.out.println("최대 속도입니다. 속도가 더 이상 올라갈 수 없습니다. ");
		} else {
			for (int i=0;i<=120;i+=5 ) {
				System.out.println("속도 증가 +5");
				System.out.println("속도: "+i);
			}
		}	
	}
	public void speedDown(int amount){
		if(speed==0){
			System.out.println("최저 속도입니다. 속도가 더 이상 내려갈 수 없습니다. ");
		} else {
			for (int i=speed;i>=0;i-=5 ) {
				System.out.println("속도 감소 -5");
				System.out.println("속도: "+i);
			}
		}
	}
}
class car3 extends Vehicle implements Movable{
	String carNum;
	public car3(int speed, String carNum) {
		super(speed);
		this.carNum=carNum;
	}
}

class Test {
	public static void main(String[] args){
		
	}
}	