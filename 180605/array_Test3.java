public class array_Test3 {
	public static void main(String[] args) {
		//�޸� ���� �׸���

		String s[]; //�迭����
		s = new String[3]; //�迭����

		s[0]= "Amy";
		s[1]= "John";
		s[2]= "Tom";

		for (int i=0;i<s.length ;i++ )
		{
			System.out.println(s[i]);
		}
	}
}