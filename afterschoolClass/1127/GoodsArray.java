import java.util.Scanner;

class Goods{
	String name;
	int price, jego, sell;
}
public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Goods g[]=new Goods[3];
		for (int i=0;i<g.length;i++) {
			g[i]=new Goods();
			System.out.print("Input name : ");
			g[i].name=sc.next();
			System.out.print("Input price : ");
			g[i].price=sc.nextInt();
			System.out.print("Input inventory: ");
			g[i].jego=sc.nextInt();
			System.out.print("Input 판매량: ");
			g[i].sell=sc.nextInt();
		}
		for (int i=0;i<g.length;i++) {
			System.out.println("이름 : " +g[i].name);
			System.out.println("가격 : "+g[i].price);
			System.out.println("재고 : "+g[i].jego);
			System.out.println("판매한 개수 : "+g[i].sell);
		}
		
	}
}
