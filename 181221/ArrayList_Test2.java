import java.util.*;
//10���� �����͸� �Է¹޾Ƽ� �ִ� ���ϱ�
class ArrayList_Test2 {
	public static void main(String[] args){
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		//for(�Է¹ޱ�) add()
		System.out.print("10���� ������ �Է� : ");
		for (int i=0;i<10;i++) {
			list2.add(sc.nextInt());
		}
		int n=0;
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) { 
				if (list2.get(i)>list2.get(j)) {
					n=list2.add(i);
				} else if(list2.get(i)<list2.get(j)) {
					n=list2.add(j);
				}
			}
		}
		System.out.println("�ִ� : "+n);

	}
}