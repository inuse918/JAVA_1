public class methodpractice1_3 {
	public int pandan() {
		int a=6;
		return a;
	}
public static void main(String[] args) {
	methodpractice1_3 t1_3=new methodpractice1_3();
	if (t1_3.pandan()%2==0){
		System.out.println("짝수입니다. ");
	}
	else {
		System.out.println("홀수입니다. ");
	}
}
}