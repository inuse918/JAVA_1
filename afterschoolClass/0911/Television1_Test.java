
public class Television1_Test {
	public static void main(String[] args) {
		Television1 myTv=new Television1();
		
		myTv.channel=7;
		myTv.volume=10;
		myTv.onoff=true;
		myTv.print();
		int ch=myTv.getchannel();
		
		System.out.println("���� ä��: "+ch);
	}
	
	
}
