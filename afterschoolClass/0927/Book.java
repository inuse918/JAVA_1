
public class Book {
	
	String title;
	String author;
	
	void show() {
		System.out.println(title+"  "+author);
	}
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출");
	}

	public static void main(String[] args) {
		Book littlePrince=new Book("어린왕자","생택쥐베리");
		Book loveStory=new Book("춘향전");
		Book loveStory1=new Book("사랑해욜");
		Book emptyBook=new Book();
		loveStory.show();
		loveStory1.show();
	}

}
