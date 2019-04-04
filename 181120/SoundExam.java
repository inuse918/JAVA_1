interface Sound{
	public void SoundUp(int level);
	public void SoundDown(int level);
}

class Tv implements Sound{
	private int SndLevel; //����
	public Tv(){
	}
	public Tv(int SndLevel){
		this.SndLevel=SndLevel;
	}
	public void SoundUp(int level){
		if (SndLevel>=0){
			SndLevel+=level;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		}
	}
	public void SoundDown(int level){
		if (SndLevel>0){
			SndLevel-=level;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		}
		else if(SndLevel<0){
			SndLevel=0;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		} else System.out.println("�̹� ������ 0 �Դϴ�.");
	}
}


class Radio implements Sound{
	private int SndLevel; //����
	public Radio(){
	}
	public Radio(int SndLevel){
		this.SndLevel=SndLevel;
	}
	public void SoundUp(int level){
		if (SndLevel>=0){
			SndLevel+=level;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		}
	}
	public void SoundDown(int level){
		if (SndLevel>0){
			SndLevel-=level;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		}
		else if(SndLevel<0){
			SndLevel=0;
			System.out.println("���� ������ "+SndLevel+"�Դϴ�.");
		} else System.out.println("�̹� ������ 0 �Դϴ�.");
	}
}

class SoundExam{
	public static void main(String[] args){
		Radio radio=new Radio();
		Tv tv=new Tv();
		Object obj=new SoundExam();
		radio.SoundUp(5);
		tv.SoundUp(5);
	}
}