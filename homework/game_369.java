public class game_369 {
	public static void main(String[] args) {
		
		System.out.println("========== 3 6 9 ���� �ڼ��� �ľ� �� ����?? ==========");
		for (int i =1;i<=100;i++){
			if (i%10==3||i%10==6||i%10==9){
				if (i/10==3||i/10==6||i/10==9){	
					System.out.println(i+"  ¦¦");
				} 
				else {
					System.out.println(i+"  ¦");
				}
			}
		}
	}
}