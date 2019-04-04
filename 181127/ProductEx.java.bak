import java.util.Scanner;

class ProductEx {
	public static void main(String[] args){
		Product pd[]=new Product[10];
		int count=0;
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("================================================");
			System.out.print("==[1] 상품추가  [2] 상품조회  [3] 끝내기==> ");
			int main_Choice=sc.nextInt();
			System.out.println("================================================");
			if (main_Choice==1){
				System.out.println("[상품종류]");
				System.out.print("[1] 책  [2] 음악CD  [3] 회화책 --> ");
				int num=sc.nextInt();
				switch (num) {
				case 1: 
							System.out.println("================================================");
							System.out.print("[ID 입력] : "); String id=sc.next(); 
							System.out.print("[Information 입력] : ");String info=sc.next();
							System.out.print("[Maker 입력] : ");String maker=sc.next();
							System.out.print("[Price 입력] : "); int price=sc.nextInt();
							System.out.print("[Title 입력] : "); String title=sc.next();
							System.out.print("[Author 입력] : "); String author=sc.next();
							System.out.print("[Isbn 입력] : "); String isbn=sc.next(); 
							System.out.println("================================================");
							pd[count]=new Book(id,info,maker,price,title,author,isbn);
							count++;
							break;
				case 2: 
							System.out.println("================================================");
							System.out.print("[ID 입력] : "); id=sc.next(); 
							System.out.print("[Information 입력] : ");info=sc.next();
							System.out.print("[Maker 입력] : ");maker=sc.next();
							System.out.print("[Price 입력] : "); price=sc.nextInt();
							System.out.print("[Title Song 입력] : "); String titleSong=sc.next();
							System.out.print("[Singer 입력] : "); String singer=sc.next();
							System.out.println("================================================");
							pd[count]=new Music(id,info,maker,price,titleSong,singer);
							count++;
							break;
				case 3: 
							System.out.println("================================================");
							System.out.print("[ID 입력] : "); id=sc.next(); 
							System.out.print("[Information 입력] : ");info=sc.next();
							System.out.print("[Maker 입력] : ");maker=sc.next();
							System.out.print("[Price 입력] : "); price=sc.nextInt();
							System.out.print("[Conversation topic 입력] : "); String topic=sc.next();
							System.out.print("[Publisher 입력] : "); String publisher=sc.next();
							System.out.println("================================================");
							pd[count]=new Music(id,info,maker,price,topic,publisher);
							count++;
							break;


				} // switch
			} // if
			else if(main_Choice==2){
					for (int i=0;i<count;i++ ) {
						pd[i].show();
					}
			}
			else if(main_Choice==3){
				System.exit(0);
			}
		}
		
	}
}