
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
		this(title,"���ڹ̻�");
	}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ��");
	}

	public static void main(String[] args) {
		Book littlePrince=new Book("�����","�����㺣��");
		Book loveStory=new Book("������");
		Book loveStory1=new Book("����ؿ�");
		Book emptyBook=new Book();
		loveStory.show();
		loveStory1.show();
	}

}
