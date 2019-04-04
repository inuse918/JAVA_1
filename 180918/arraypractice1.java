public class arraypractice1 {
	public static void main(String[] args){
		int a[]=new int[899];
		int sum=0, count=0;
		for (int i=0;i<a.length;i++){
			a[i]=100+i;
			if (a[i]%6==0){
				sum+=a[i];
				count++;
			}
		}
		System.out.println("100~999까지 6의 배수의 합은 "+sum+" 이고 개수는 "+count+" 개 입니다. ");
	}
}