
public class Television {
	int channel;
	int volume;
	boolean onoff;
	void print() {
		System.out.println("�ڸ������� ä���� "+channel+
				" �̰� ������"+volume+" �̰� ���´�"+onoff+" �Դϴ�.");
	}
	
	public static void main(String[] args) {
		Television tv=new Television();
		
		tv.channel=7;
		tv.volume=6;
		tv.onoff=true;
		
		/*System.out.println("�ڸ������� ä���� "+tv.channel+
				" �̰� ������"+tv.volume+" �̰� ���´�"+tv.onoff+" �Դϴ�.");*/
		
		tv.print();
		
		Television yourTv=new Television();
		
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onoff=true;
		System.out.println("�ڸ������� ä���� "+yourTv.channel+
				" �̰� ������"+yourTv.volume+" �̰� ���´�"+yourTv.onoff+" �Դϴ�.");
		
		Television tv1 = new Television();
		Television tv2 = tv1; //tv1�� tv2�� ����Ŵ
		
		int x=10, y=20;
		y=x;
		
	}
}
