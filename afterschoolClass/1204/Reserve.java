import java.util.Scanner;

public class Reserve{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Reserve_do[] rd=new Reserve_do[10];
		int count=0;
		while (true) {
			System.out.println("[1]���� [2]��ȸ [3]��� [4]������");
			int num=sc.nextInt();
			String jari[][]=new String[3][7];
			for(int i=0;i<jari.length;i++) {
				for (int j=0;j<i;j++) {
					jari[i][j]="--- ";
				}
			}
			if(num==1) {
				System.out.println("<�¼� ����>");
				System.out.println("[1]S�� [2]A�� [3]B��");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("*****************************************************");
					System.out.println("S��");
					for (int i=0;i<jari.length;i++) {
						System.out.println();
					}
					System.out.println("[�¼���ȣ �Է�] : "); int number=sc.nextInt();
					System.out.println("[�����ڸ� �Է�] : "); String name=sc.next(); 
					System.out.println("[������ ��ȭ��ȣ �Է�] : ");String tel=sc.next(); 
					System.out.println("*****************************************************");
					rd[count]=new Reserve_do(name,tel,number); 
					count++;
					break;
				case 2:
					System.out.println("*****************************************************");
					System.out.println("A��");
					for (int i=0;i<jari.length;i++) {
						
					}
					System.out.println("[�¼���ȣ �Է�] : "); number=sc.nextInt();
					System.out.println("[�����ڸ� �Է�] : "); name=sc.next(); 
					System.out.println("[������ ��ȭ��ȣ �Է�] : ");tel=sc.next(); 
					System.out.println("*****************************************************");
					rd[count]=new Reserve_do(name,tel,number); 
					count++;
					break;
				case 3:
					System.out.println("*****************************************************");
					System.out.println("B��");
					System.out.println("[�¼���ȣ �Է�] : "); number=sc.nextInt();
					System.out.println("[�����ڸ� �Է�] : "); name=sc.next(); 
					System.out.println("[������ ��ȭ��ȣ �Է�] : ");tel=sc.next(); 
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
				System.out.println("�� ��° ���Ÿ� ����Ͻðڽ��ϱ� ? (ù ��° ���ź��� 1��~... ���ڷ� �Է����ּ���)");
				int choice=0;
				int number=0;
				String name="";
				String tel="";
				
				

			}
			else if(num==4) System.exit(0);
			
		}
	}
}
