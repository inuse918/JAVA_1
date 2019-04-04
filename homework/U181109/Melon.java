class Melon extends Food{
	String location;

	public Melon(int price,double kcal,double weight,String location){
		super(price,kcal,weight);
		this.location=location;
	}
	public String toString(){
		return "[가격] "+price+"\n[k칼로리] "+kcal+"\n[중량] "+weight+"\n[경작농원정보] "+location;

	}
}