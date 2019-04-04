class Person8{
	private String name, addr,tel;
	
	public Person8(String name,String addr,String tel){
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAddr(String addr){
		this.addr=addr;
	}

	public String getAddr(){
		return addr;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getTel(){
		return tel;
	}
	public String toString(){
		return "이름: "+name+" 주소: "+addr+" 번호: "+tel;
	}
	

}