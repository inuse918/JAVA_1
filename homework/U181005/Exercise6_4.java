class Exercise6_4{
	public static void main(String[] args) {
	Student s=new Student();
	s.name="È«±æµ¿";
	s.ban=1;
	s.no=1;
	s.kor=100;
	s.eng=60;
	s.math=76;
	System.out.println("ÀÌ¸§:"+s.name);
	System.out.println("ÃÑÁ¡:"+s.getTotal());
	System.out.printf("Æò±Õ:%.1f\n",s.getAverage());
	} //main
} //class

class Student {
	String name;
	int ban, no, kor,eng,math;
	public int getTotal() {
		return kor+eng+math;
	}//getTotal
	public float getAverage() {
		return getTotal()/3f;
	}//getAverage
} //class