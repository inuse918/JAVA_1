
public class PrintManager {
	public static void main(String[] args) {
		LaserPrinter lp=new LaserPrinter("AAA","windows",Printer.USB,5,);
		InkjetPrinter ip=new InkjetPrinter("BBB","samsung",Printer.PARALLEL,3,);
		
		for(int i=0; i<5; i++) {
			System.out.println("****************************");
			System.out.println("[������ �����Ϳ��� ����մϴ�]");
			System.out.println("���� �μ���� �ż�: "+);
			System.out.println("����� �μ���� �ż�:"+);
			System.out.println("��� �ܷ�: "+);
			System.out.println("****************************");
			System.out.println("[��ũ�� �����Ϳ��� ����մϴ�]");
			System.out.println("���� �μ���� �ż�: "+);
			System.out.println("����� �μ���� �ż�:"+);
			System.out.println("��ũ �ܷ�: "+);
		}
	}
}
