public class munjea4 {
	public static void main(String[] args) {
		//4. 100~999 ��ÿ� 4�� ����� �ƴ� ������ ������ ��
		int a[]=new int[900];
		int cou=0,tot=0;
		for (int i=0;i<a.length;i++){
			a[i]=i+100;
			if (a[i]%4!=0){
				cou++;
				tot+=a[i];
			}
		}
		System.out.println("4�� ����� �ƴ� ���� ���� : "+cou+" �� : "+tot);
	}
}