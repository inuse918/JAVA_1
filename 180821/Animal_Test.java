class Animal_Test {
	public static void main(String[] args){
		
		Animal cat=new Animal(); //��ü����
		cat.name="�����";
		cat.owner="Mike";
		//Scanner sc=new Scanner();

		System.out.println(cat.name);
		System.out.println(cat.owner);

		cat.bark();
		cat.eat();
		
		Animal dog=new Animal();
		dog.name="������";
		dog.owner="�����";

		System.out.println(dog.name);
		System.out.println(dog.owner);

		dog.bark();
		dog.eat();

		Animal fish=new Animal();
		fish.name="�ؾ�ؾ�ݺؾ�";
		fish.owner="�t�b��";

		System.out.println(fish.name);
		System.out.println(fish.owner);

		fish.bark();
		fish.eat1();
	}
}