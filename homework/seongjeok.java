import java.util.*;

public class seongjeok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[]=new String[5];
		int seo[][]=new int[5][4];
		int tot[]=new int[5];
		float avg;
		System.out.println("===[5���� ���� �Է� ���α׷�]===");
		System.out.println("-�Է� ����-");
		for (int i=0;i<name.length;i++,ii){ 
			System.out.print("�̸�: ");
			name[i]=sc.next(); 
				for (int ii=0;ii<seo.length ;ii++ ){
					for (int ii2=0;ii2<seo[ii].length;ii2++ ){
						System.out.print("�й�: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("���� ����: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("���� ����: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("���� ����: ");
						seo[ii][ii2]=sc.nextInt();
						break;
				}	break;		
			}break;
		}	
		/*for (int i3=0;i3<seo.length;i3++){
			for (int i4=1;i4<seo[i3].length;i4++){
				total+=seo[i3][i4];
				avg=(float)total/3;
			}
		}*/
		System.out.println("***************���� ���***************");
		System.out.print("�̸� |");
		for (int i5=0;i5<name.length;i5++){
			System.out.print("    "+name[i5]+"    |");
		}
		System.out.print("\n�й� |");
			for (int i6=0;i6<seo.length;i6++ ){
			System.out.print("  "+seo[1][0]+"  |");
		}
		
	}
}