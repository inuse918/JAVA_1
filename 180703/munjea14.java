public class munjea14 {
	public static void main(String[] args){
		//14. 10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int even=0,odd=0;
		int a[]=new int[10];
		for (int i=0;i<10;i++){
			a[i]=Integer.parseInt(args[i]);
			if (a[i]%2==0){
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("¦���� ������ " +even+" ��, Ȧ���� ������ "+odd+" �� �Դϴ�.");
	}
}