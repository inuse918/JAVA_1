public class over10 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (true)
		{
			sum+=i;
			if (sum>=100)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}