class For_Test5 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
			for(int i=1; i<=100; i++) {
				if(i%2==0){
					a=a+i;
				} 
				else{
					b=b+i;
				}
				
			}
			System.out.println("Â¦¼öÀÇ ÇÕ : " + a + " È¦¼öÀÇ ÇÕ : " + b);
	}
}