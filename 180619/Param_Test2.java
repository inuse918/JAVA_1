public class Param_Test2 {
	public static void main(String ar[]){
		
		int a[]=new int[5];
		int b[]=new int[5];
		for (int i = 0;i<a.length ;i++ )
		{
			int b = Integer.parseInt(ar[i]);
			a=ar[i];
			
		}
		int max = a;
		int min = a;
		
			System.out.println("최대값 : " +max+" | 최소값 : "+min);
		
	}
}