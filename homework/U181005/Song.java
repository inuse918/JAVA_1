/*
  ________			_________
	(�̤�)				   (�̤�)
	N								 N

	O				.,				  O              ����

   o   �ѤѤѤѤѤѤѤ� o


������ü�迭 �𸣰ھ��..
*/
class Song {
	 String title, artist, album, composer, year;
	 int track;
	
	public Song(String title, String artist, String album, String composer, String year,int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	public Song(){
	}
	public void show(String title, String artist, String album, String composer, String year,int track){
		System.out.println("���� :"+title);
		System.out.println("���� : "+artist);
		System.out.println("�ٹ��� : "+album);
		System.out.println("�۰ : "+composer);
		System.out.println("�⵵ : "+year);
		System.out.println("Ʈ����ȣ : "+track);
	}
	public static void main(String[] args) {
		Song s=new Song();
		s.show("Dancing Queen","ABBA","Dancing Queen","��ä��","2002",1);
		
	}
}