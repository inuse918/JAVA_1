public class munjea4 {
	public static void main(String[] args) {
		//4. 100~999 사시에 4의 배수가 아닌 수들의 개수와 합
		int a[]=new int[900];
		int cou=0,tot=0;
		for (int i=0;i<a.length;i++){
			a[i]=i+100;
			if (a[i]%4!=0){
				cou++;
				tot+=a[i];
			}
		}
		System.out.println("4의 배수가 아닌 수의 개수 : "+cou+" 합 : "+tot);
	}
}