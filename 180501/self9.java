import java.util.*;

class self9 {
	public static void main(String[] args){
		int count = 0;
		for(int i = 1; i<=100; i++)
		{	
			if (i%4==0)
			{
				System.out.print(i+" ");
				count++;
				if (count%8==0)
				{
					System.out.println();
				}
				
			}	
		}
		//Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
	}
}