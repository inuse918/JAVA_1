import java.util.Scanner;

public class Reserve{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Reserve_do[] rd=new Reserve_do[10];
		int count=0;
		while (true) {
			System.out.println("[1]예약 [2]조회 [3]취소 [4]끝내기");
			int num=sc.nextInt();
			String jari[][]=new String[3][7];
			for(int i=0;i<jari.length;i++) {
				for (int j=0;j<i;j++) {
					jari[i][j]="--- ";
				}
			}
			if(num==1) {
				System.out.println("<좌석 구분>");
				System.out.println("[1]S열 [2]A열 [3]B열");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("*****************************************************");
					System.out.println("S열");
					for (int i=0;i<jari.length;i++) {
						System.out.println();
					}
					System.out.println("[좌석번호 입력] : "); int number=sc.nextInt();
					System.out.println("[예매자명 입력] : "); String name=sc.next(); 
					System.out.println("[예매자 전화번호 입력] : ");String tel=sc.next(); 
					System.out.println("*****************************************************");
					rd[count]=new Reserve_do(name,tel,number); 
					count++;
					break;
				case 2:
					System.out.println("*****************************************************");
					System.out.println("A열");
					for (int i=0;i<jari.length;i++) {
						
					}
					System.out.println("[좌석번호 입력] : "); number=sc.nextInt();
					System.out.println("[예매자명 입력] : "); name=sc.next(); 
					System.out.println("[예매자 전화번호 입력] : ");tel=sc.next(); 
					System.out.println("*****************************************************");
					rd[count]=new Reserve_do(name,tel,number); 
					count++;
					break;
				case 3:
					System.out.println("*****************************************************");
					System.out.println("B열");
					System.out.println("[좌석번호 입력] : "); number=sc.nextInt();
					System.out.println("[예매자명 입력] : "); name=sc.next(); 
					System.out.println("[예매자 전화번호 입력] : ");tel=sc.next(); 
					System.out.println("*****************************************************");
					rd[count]=new Reserve_do(name,tel,number); 
					count++;
					break;	
				}
			}
			else if(num==2) {
				for(int i=0;i<count;i++) {
					rd[i].show();
				}
			}
			else if(num==3) {
				System.out.println("몇 번째 예매를 취소하시겠습니까 ? (첫 번째 예매부터 1번~... 숫자로 입력해주세요)");
				int choice=0;
				int number=0;
				String name="";
				String tel="";
				
				

			}
			else if(num==4) System.exit(0);
			
		}
	}
}
