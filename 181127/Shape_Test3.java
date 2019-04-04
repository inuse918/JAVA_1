import java.util.Scanner;

class Shape_Test3 {
	public static void main(String[] args){
		int count=0; //index
		Menu m=new Menu();
		Scanner sc=new Scanner(System.in);

		while (true)	{
			System.out.print("[1] 삽입 [2] 삭제 [3] 보기 [4] 종료 >>> ");
			int you=sc.nextInt();
			switch (you)	{
			case 1: m.Insert(count); count++;break;
			case 2: m.delete();break;
			case 3: m.view(count);break;
			case 4: m.Exit();break;
			default : System.out.println("Error!!");
			}

		}
	}
}