interface Sound{
	public void SoundUp(int level);
	public void SoundDown(int level);
}

class Tv implements Sound{
	private int SndLevel; //볼륨
	public Tv(){
	}
	public Tv(int SndLevel){
		this.SndLevel=SndLevel;
	}
	public void SoundUp(int level){
		if (SndLevel>=0){
			SndLevel+=level;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		}
	}
	public void SoundDown(int level){
		if (SndLevel>0){
			SndLevel-=level;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		}
		else if(SndLevel<0){
			SndLevel=0;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		} else System.out.println("이미 볼륨이 0 입니다.");
	}
}


class Radio implements Sound{
	private int SndLevel; //볼륨
	public Radio(){
	}
	public Radio(int SndLevel){
		this.SndLevel=SndLevel;
	}
	public void SoundUp(int level){
		if (SndLevel>=0){
			SndLevel+=level;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		}
	}
	public void SoundDown(int level){
		if (SndLevel>0){
			SndLevel-=level;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		}
		else if(SndLevel<0){
			SndLevel=0;
			System.out.println("현재 볼륨은 "+SndLevel+"입니다.");
		} else System.out.println("이미 볼륨이 0 입니다.");
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