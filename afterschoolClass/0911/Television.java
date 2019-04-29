
public class Television {
	int channel;
	int volume;
	boolean onoff;
	void print() {
		System.out.println("텔리비전의 채널은 "+channel+
				" 이고 볼륨은"+volume+" 이고 상태는"+onoff+" 입니다.");
	}
	
	public static void main(String[] args) {
		Television tv=new Television();
		
		tv.channel=7;
		tv.volume=6;
		tv.onoff=true;
		
		/*System.out.println("텔리비전의 채널은 "+tv.channel+
				" 이고 볼륨은"+tv.volume+" 이고 상태는"+tv.onoff+" 입니다.");*/
		
		tv.print();
		
		Television yourTv=new Television();
		
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onoff=true;
		System.out.println("텔리비전의 채널은 "+yourTv.channel+
				" 이고 볼륨은"+yourTv.volume+" 이고 상태는"+yourTv.onoff+" 입니다.");
		
		Television tv1 = new Television();
		Television tv2 = tv1; //tv1이 tv2도 가리킴
		
		int x=10, y=20;
		y=x;
		
	}
}
