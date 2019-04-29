
public class LaserPrinter extends Printer {
	private int toner=10;
	public LaserPrinter(String modelName, String manufacturer, int type, int numberOfPaper,int numberOfPrinted) {
		super(modelName,manufacturer,type,numberOfPaper,numberOfPrinted);
		this.toner=toner;
	}
	abstract public boolean print() {
		if(toner<=0) {
			System.out.println("��ʰ� �����մϴ�.");
			return false;
		}
		else {
			toner-=5;
		}
		
		
	}
	public int getToner() {
		return toner;
	}
	
	

	}
