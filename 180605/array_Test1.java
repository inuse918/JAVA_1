public class array_Test1 {
	public static void main(String[] args) {

		int a[]; //배열 선언
		a=new int[5]; //배열 생성
		//int a[] = new int[5];

		for (int i=0; i<=4 ;i++ )
		{
			a[i]=i+1;
			System.out.println(a[i]);
		} //for
		
	System.out.println("배열의 크기: "+a.length);
	} //main
}