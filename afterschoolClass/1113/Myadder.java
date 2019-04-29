class Myadder implements AdderInterface{
	int sum;
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int n) {
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Myadder adder=new Myadder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}
}
