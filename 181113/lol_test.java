interface lol{
	int MAX=100;
	int MIN=0;

	public void movable();
	public int attackable();
}

class soraka implements lol{
	int x=0, y=0;
	String color="�����";
	public void movable(){
		if (x>MAX||y>MAX){
			x=0;
			y=0;
			System.out.println("��ǥ�� �ִ뺸�� �� Ů�ϴ�. �������� �̵��մϴ�.");
		}else if(x<MIN||y<MIN) {
			x=0;
			y=0;
			System.out.println("��ǥ�� �ּҺ��� �� �۽��ϴ�. �������� �̵��մϴ�.");
		}

	}	
	public int attackable(){
		int attack=50;
		return attack;
	}
}

class ezreal implements lol{
	int x=0, y=0;
	String color="�����";
	public void movable(){
		if (x>MAX||y>MAX){
			x=0;
			y=0;
			System.out.println("��ǥ�� �ִ뺸�� �� Ů�ϴ�. �������� �̵��մϴ�.");
		}else if(x<MIN||y<MIN) {
			x=0;
			y=0;
			System.out.println("��ǥ�� �ּҺ��� �� �۽��ϴ�. �������� �̵��մϴ�.");
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