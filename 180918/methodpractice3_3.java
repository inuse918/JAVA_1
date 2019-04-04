public class methodpractice3_3 {
	public int zero() {
		int a=4;
		return a;
	}
	public static void main(String[] args) {
		methodpractice3_3 t3_3=new methodpractice3_3 ();
		if (t3_3.zero()<0){
			System.out.println("음수입니다. ");
		}
		else {
			System.out.println("양수입니다. ");
		}
	}
}