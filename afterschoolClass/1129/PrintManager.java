
public class PrintManager {
	public static void main(String[] args) {
		LaserPrinter lp=new LaserPrinter("AAA","windows",Printer.USB,5,);
		InkjetPrinter ip=new InkjetPrinter("BBB","samsung",Printer.PARALLEL,3,);
		
		for(int i=0; i<5; i++) {
			System.out.println("****************************");
			System.out.println("[레이저 프린터에서 출력합니다]");
			System.out.println("남은 인쇄용지 매수: "+);
			System.out.println("출력한 인쇄용지 매수:"+);
			System.out.println("토너 잔량: "+);
			System.out.println("****************************");
			System.out.println("[잉크젯 프린터에서 출력합니다]");
			System.out.println("남은 인쇄용지 매수: "+);
			System.out.println("출력한 인쇄용지 매수:"+);
			System.out.println("잉크 잔량: "+);
		}
	}
}
