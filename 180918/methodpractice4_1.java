public class methodpractice4_1 {
	public void add(){
		int a=1;
		int b=5;
		int s=0;
		for (int i=a;i<=b;i++){
			s+=i;
		}
		System.out.println(a+" 부터 "+ b +" 까지의 합은 "+ s + "입니다.");
	}

public static void main(String[] args) {
	methodpractice4_1 t4_1=new methodpractice4_1();
	t4_1.add();

}
}