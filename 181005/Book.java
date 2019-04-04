class Book {
	private String title,author, publish;
	private int price;

	public Book(String title, String author, String publish, int price){
		this.title=title;
		this.author=author;
		this.publish=publish;
		this.price=price;
	}
	public Book() {

	}
	public Book(String title, String publish, int price) {
		this.title=title;
		this.publish=publish;
		this.price=price;
	}
	public Book(String title,int price){
		this.title=title;
		this.price=price;
	}
	public void setAuthor(String a) {
		author=a;
	}
	public void setTitle(String t) {
		title=t;
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}

	public static void main(String[] args){
		Book b1=new Book("A","a","aa",100);
		Book b2=new Book("B","bb",200);
		Book b3=new Book("C",300);
		Book b4=new Book();

		b4.setAuthor("Mine");
		b4.setTitle("WOWOW");
		System.out.println(b4.getAuthor());
		System.out.println(b4.getTitle());
	}
}