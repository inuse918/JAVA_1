import java.util.Scanner;

class Book{
	String title,author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class BookArray {
	public static void main(String[] args) {
		Book[] book=new Book[2];
		Scanner sc=new Scanner(System.in);
		String title,author;
		
		
		for(int i=0;i<book.length;i++) {
			System.out.print("제목 입력");
			title=sc.nextLine();
			System.out.print("저자 입력");
			author=sc.nextLine();
			
			book[i]=new Book(title,author);
		}
		for(int i=0;i<book.length;i++)
		System.out.println("제목은 "+book[i].title+" 저자는 "+book[i].author);
	}
}
