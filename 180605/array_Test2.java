public class array_Test2 {
	public static void main(String[] args) {
		
		char ch[]; //배열선언
		ch = new char [26]; //배열 생성
		
		for (int i=0;i<ch.length ;i++ )
		{
			ch[i]=(char)(i+65);
			System.out.println(ch[i]);
		}
	}
}