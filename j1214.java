import java.util.*;

public class j1214 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String ar[]=new String[5];
		String y="";
		int sco[]=new int[5];
		int tot=0,temp=0;
		float avg;
	
		System.out.println("5���� ������� �Է��ϼ���>>: ");

		for (int i=0;i<ar.length;i++){
				ar[i]=sc.next();
		} //for i

		System.out.println("============================"); 
		System.out.println("5���� ������ �Է��ϼ���>>: ");

		for (int i2=0;i2<sco.length;i2++){
			sco[i2]=sc.nextInt();
			tot+=sco[i2];
		}

		for (int i3=0;i3<sco.length;i3++ ){
			for (int i4=i3+1;i4<sco.length;i4++){
				if (sco[i3]<sco[i4]){
					temp=sco[i3];
					sco[i3]=sco[i4];
					sco[i4]=temp;
				}
			}
		}
		avg=(float)(tot/5);
		System.out.println("============================\n���� ����>> "+tot);
		System.out.println("���� ���>> "+avg);
		System.out.println("�ְ�����>> "+sco[0]);
		System.out.println("��������>> "+sco[4]);
		System.out.println("============================");

		
		do
		{
			System.out.println("�˻��� ������� �Է��ϼ���: ");
			y=sc.next();
			for (int i7=0;i7<ar.length;i7++){
				if (y.equals(sco[i7])){
					System.out.println(ar[i7]+"�� ����: "+sco[i7]);
				}
			}
		}
		while (y.equals("�׸�"));
			

	}//main
}