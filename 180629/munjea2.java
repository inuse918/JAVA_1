public class munjea2 {
	public static void main(String[] args) {
		//2. 1���� 100������ ���� �߿��� 4�� ����� ����ϵ�, �� �ٿ� 8������ ���
		int a[]=new int[100];
		int count=0;
		for (int i=0;i<a.length;i++){
			a[i]=i+1;
			if (a[i]%4==0){
				System.out.print(a[i]+"  ");
				count++;
				if (count%8==0){
					System.out.println();
				}
			}
			
		}

	}
}