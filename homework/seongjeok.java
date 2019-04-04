import java.util.*;

public class seongjeok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[]=new String[5];
		int seo[][]=new int[5][4];
		int tot[]=new int[5];
		float avg;
		System.out.println("===[5명의 성적 입력 프로그램]===");
		System.out.println("-입력 시작-");
		for (int i=0;i<name.length;i++,ii){ 
			System.out.print("이름: ");
			name[i]=sc.next(); 
				for (int ii=0;ii<seo.length ;ii++ ){
					for (int ii2=0;ii2<seo[ii].length;ii2++ ){
						System.out.print("학번: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("국어 점수: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("영어 점수: ");
						seo[ii][ii2]=sc.nextInt();
						System.out.print("수학 점수: ");
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
		System.out.println("***************성적 출력***************");
		System.out.print("이름 |");
		for (int i5=0;i5<name.length;i5++){
			System.out.print("    "+name[i5]+"    |");
		}
		System.out.print("\n학번 |");
			for (int i6=0;i6<seo.length;i6++ ){
			System.out.print("  "+seo[1][0]+"  |");
		}
		
	}
}