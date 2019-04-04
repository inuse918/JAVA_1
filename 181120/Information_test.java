import java.util.*;

class Information {
	private String name,telephone,skill,address;
	private int age;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public String getTelephone(){
		return telephone;
	}
	public void setSkill(String skill){
		this.skill=skill;
	}
	public String getSkill(){
		return skill;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

	public void print(){
		System.out.println("***************************************");
		System.out.println("이름 | "+getName());
		System.out.println("나이 | "+getAge());
		System.out.println("전화번호 | "+getTelephone());
		System.out.println("특기 | "+getSkill());
		System.out.println("주소 | "+getAddress());
	}
}

class  Information_test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("***************************************");
		System.out.print("입력할 인원 : "); //121431 dbtjdud02!
		int num=sc.nextInt();
		Information i[]=new Information[num];
		System.out.println("***************정보 입력***************");
		for (int j=0;j<i.length ;j++){
			i[j]=new Information();
			System.out.print("이름 입력 : ");
			i[j].setName(sc.next());
			System.out.print("나이 입력 : ");
			i[j].setAge(sc.nextInt());
			System.out.print("전화번호 입력 : ");
			i[j].setTelephone(sc.next());
			System.out.print("특기 입력 : ");
			i[j].setSkill(sc.next());
			System.out.print("주소 입력 : ");
			i[j].setAddress(sc.next());
		}
	}
}