class magazine extends Book{
	String date;
	
	public magazine(String title,String page,String author,String date){
		super(title,page,author);
		this.date=date;
	}

	public String toString(){
		return "����: "+title+"\n������ ��: "+page+"��\n����: "+author+"\n�߸���: "+date;
	}
}