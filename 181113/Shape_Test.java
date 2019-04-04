import java.util.*;

abstract class ShapeExam {
	public abstract double getArea();
	public abstract double getCircum();
}

class ShapeTest extends ShapeExam{
	Scanner sc=new Scanner
	public double getArea(double r){
		double PI=3.14;
		return 2*PI*r;
	}
	public double getCircum(double r){
		double PI=3.14;
		return PI*r*r;
	}
}	
public class Shape_Test extends ShapeTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ShapeTest s=new ShapeTest();
		
		System.out.print("둘레와 면적을 구할 원의 반지름 입력: ");
		System.out.println("원의 둘레 : "+s.getArea());
		s.getCircum("원의 면적 : "+s.getCircum());
	}
}

