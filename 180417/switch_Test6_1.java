import java.util.*;

class switch_Test6_1 {
	public static void main(String[] args) {
	int month=Calendar.getInstance().get(Calendar.MONTH)+1;
	String season="";
		switch(month) {
			case 12: case 1: case 2:
			season="�ܿ�";
			break;
			case 3: case 4: case 5:
			season="��";
			break;
			case 6: case 7: case 8:
			season="����";
			break;
			default:
			season="����";

		}
		System.out.println(season);
	}
}