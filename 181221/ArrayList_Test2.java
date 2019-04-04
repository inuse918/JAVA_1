import java.util.*;
//10개의 데이터를 입력받아서 최댓값 구하기
class ArrayList_Test2 {
	public static void main(String[] args){
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		//for(입력받기) add()
		System.out.print("10개의 데이터 입력 : ");
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
		System.out.println("최댓값 : "+n);

	}
}