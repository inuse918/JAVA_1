public class c_p445_12 {
	public static void main (String[] args) {
		
		int total=0;
		int i,j;
		int a[][] = {{78,48,78,98},{99,92,83,29},{29,64,83,89},{34,78,92,56}};
		

		// ��ü�� ��
		for (i=0;i<a.length ;i++ )
		{
			for (j=0;j<a[i].length ;j++)
			{
				total+=a[i][j];
			}
		}
		System.out.println("��ü�� �� : " + total);
		System.out.println("**************************");
		total=0;
		
		// ������ ��
		for (i=0;i<a.length;i++ )
		{
			for (j=0;j<a[i].length ;j++ )
			{
				total+=a[i][j];
			}
			System.out.println("������ �� : " + total);
			total=0;
		}
		total=0;
		System.out.println("**************************");

		// ������ ��
		for (i=0;i<a.length ;i++  )
		{
			for (j=0;j<a[i].length ;j++)
			{
				
				total+=a[j][i];
			}
			System.out.println("������ �� : " + total);
			total=0;
		}
		
		
		System.out.println("**************************");
	}
}