import java.util.*;

public class Seo_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[]=new String[5];
		int seo[][]=new int[5][4];
		int tot[]=new int[5];
		float avg;

		System.out.println("==========[5���� ���� �Է� ���α׷�]==========");
		
		for (int i=0,j=i;i<seo.length&&j<seo[i].length;i++){
			System.out.print("| �̸� | ");
			name[i]=sc.next();
			System.out.print("| �й� | ");
			seo[i][j]=sc.nextInt();
			j++;
			System.out.print("| ���� ���� | ");
			seo[i][j]=sc.nextInt();
			j++;
			System.out.print("| ���� ���� | ");
			seo[i][j]=sc.nextInt();
			j++;
			System.out.print("| ���� ���� | ");
			seo[i][j]=sc.nextInt();
			j=0;
		}
		for (int i2=0;i2<tot.length;i2++){
			for (int i3=0;i3<seo[i2].length;i3++ ){
				tot[i2]+=seo[i2][i3];
			}
		}
		System.out.println("==========[���� ���]==========");
		System.out.println("\t�̸�\t�й�\t����\t����\t����");
		for (int i4=0;i4<name.length;i4++){
			
		}
	}//main
}