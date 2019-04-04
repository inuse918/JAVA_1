interface lol{
	int MAX=100;
	int MIN=0;

	public void movable();
	public int attackable();
}

class soraka implements lol{
	int x=0, y=0;
	String color="보라색";
	public void movable(){
		if (x>MAX||y>MAX){
			x=0;
			y=0;
			System.out.println("좌표가 최대보다 더 큽니다. 원점으로 이동합니다.");
		}else if(x<MIN||y<MIN) {
			x=0;
			y=0;
			System.out.println("좌표가 최소보다 더 작습니다. 원점으로 이동합니다.");
		}

	}	
	public int attackable(){
		int attack=50;
		return attack;
	}
}

class ezreal implements lol{
	int x=0, y=0;
	String color="노란색";
	public void movable(){
		if (x>MAX||y>MAX){
			x=0;
			y=0;
			System.out.println("좌표가 최대보다 더 큽니다. 원점으로 이동합니다.");
		}else if(x<MIN||y<MIN) {
			x=0;
			y=0;
			System.out.println("좌표가 최소보다 더 작습니다. 원점으로 이동합니다.");
		}
	}	
	public int attackable(){
		int attack=150;
		return attack;
	}
}

public class lol_test extends ezreal{
	public static void main(String[] args){
		ezreal e=new ezreal();
		soraka s=new soraka(); j
	}
}