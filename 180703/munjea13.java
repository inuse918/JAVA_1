public class munjea13 {
	public static void main(String[] args){
		//13. 100������ �ڿ���n�� �Է¹޾� 1����n������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a=Integer.parseInt(args[0]);
		float sum=0;
		int i,count=0;
		if (a>100){
			System.out.println("100���� ū �����Դϴ�. �ٽ� �Է��� �ּ���.");
			System.exit(0);
		}
		for (i=1;i<=a;i++){
			sum+=i;
			count++;
		}
		System.out.println("����� "+(float)sum/count);
	}
}