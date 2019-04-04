public class Television_Test extends Television{
	public static void main(String[ ] args){
		Television t=new Television("KV-102","LG",300);
		/*t.setModel("KV-102");
		t.setMaker("LG");
		t.setPrice(300);*/

		System.out.println("\""+t.getModel()+"\", \""+t.getMaker()+"\", \""+t.getPrice()+"\"");
	}
}	