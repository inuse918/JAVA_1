import java.util.*;
class Menu {
	Scanner sc=new Scanner (System.in);
	Figure f[]=new Figure[10];

	public Menu () {
		for (int i=0;i<f.length;i++){
		f[i]=new Figure();
		}
	}
	public void Exit(){
		System.out.println("The service has been terminated.");
		System.exit(0);
	}
	public void Insert(int i){
		System.out.print("도형종류 [1] Heart [2] Star [3] Circle >>> ");
		int n=sc.nextInt();
		switch (n){
			case 1: f[i].type="Heart"; break;
			case 2: f[i].type="Star"; break;
			case 3: f[i].type="Circle"; break;
			default : System.out.println("Error!!");
		}
	}
	public void view (int c){
		for (int i=0;i<c;i++ ) {
			f[i].draw();
		}
	}
	public void delete (){
		System.out.print("삭제할 도형의 위치 >>> ");
		int your=sc.nextInt();
		f[your-1].type="";
	}
}