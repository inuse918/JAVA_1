class Switch_Test1 {
	public static void main(String[] args){
		int a=20;
		int b=10;
		char c='+';
		switch(c){
			case '+' : System.out.println( a + "+" + b + "=" + (a+b) );
			break;
			case '-' : System.out.println( a + "-" + b + "=" + (a-b) );
			break;
			case '*' : System.out.println( a + "*" + b + "=" + (a*b) );
			break;
			case '%' : System.out.println( a + "%" + b + "=" + (a%b) );
			break;
			default : System.out.println("¾ÈµÅ. µ¹¾Æ°¡");
			break;
		}
			
	}
}