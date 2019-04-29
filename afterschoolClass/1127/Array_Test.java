class Person{
	int age;
}
public class Array_Test {
	public static void main(String[] args) {
		Person pa[]=new Person[10];
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person();
			pa[i].age=i+30;
			System.out.println(pa[i].age);
		}
		
	}
}
