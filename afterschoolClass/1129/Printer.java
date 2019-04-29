
public abstract class Printer {
	public static int USB=0;
	public static int PARALLEL=1;
	private String modelName;
	private String manufacturer;
	private int type;
	protected int numberOfPrinted; //인쇄한 종이 매수
	protected int numberOfPaper; //남은 종이 매수
	abstract public boolean print();
	
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setType(int type) {
		this.type=type;
	}
	public int getType() {
		return type;
	}
	
	
	public Printer(String modelName, String manufacturer, int type, int numberOfPaper,int numberOfPrinted) {
		this.modelName=modelName;
		this.manufacturer=manufacturer;
		this.type=type;
		this.numberOfPaper=numberOfPaper;
		this.numberOfPrinted=numberOfPrinted;
	}
}
