class switch_Test5 {
	public static void main(String[] args) {
		int month = 8;
			switch(month) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10: 
				case 12: System.out.println("31��");
				break;
				default : System.out.println("30��");
			}
	}
}