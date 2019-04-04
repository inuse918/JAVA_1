public class methodpractice3_1 {
	public void zero() {
		int a=5;
		if (a<0){
			System.out.println("음수입니다. ");
		}
		else {
			System.out.println("양수입니다. ");
		}
	}

	public static void main(String[] args) {
		methodpractice3_1 t3_1=new methodpractice3_1 ();
		t3_1.zero();
	}
}