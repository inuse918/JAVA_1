import java.util.*;
class Account{
	Scanner sc=new Scanner(System.in);
	private String account_No; // ���¹�ȣ
	private String passwd; // ��й�ȣ
	private String owner; // ������
	private int balance; // �ܰ�

	public void setaccount_No()	{
		System.out.print("���¹�ȣ ������ �϶󱸿�~ : ");
		account_No=sc.next();
	} // ���¹�ȣ ����
	public void deposit() {
		System.out.print("�Ա��� �ݾ��� �Է��϶󱸿�~ : ");
		balance+=sc.nextInt();
		System.out.println("�ܾ��� "+balance+" �� �̶�~(����)");
	} // �Ա�
	public void widthDraw() {
		System.out.print("����� �ݾ��� �Է��϶󱸿�~ : ");
		int wid_money=sc.nextInt();
	
			if (wid_money>balance) {
				System.out.println("�ܾ��� �����ϴٱ���~ ");
			}
			else if (wid_money==balance){
				balance-=wid_money;
				System.out.println("�ܾ��� 0���̶�~");
			}
			else {
				balance-=wid_money;
				System.out.println("�ܾ��� "+balance+" �� �̶�~(����)");
			}
	} // ���

	public void setpasswd(){
		System.out.print("��й�ȣ �����϶󱸿�~ : ");
			passwd=sc.next();
	} // ��й�ȣ ����
	
	public void setowner(){
		System.out.print("������ �����϶󱸿�~ : ");
		owner=sc.next();
	} // ������ ����

	public void setmoney(){
		System.out.print("�ܰ� �����϶󱸿�~ : ");
		balance=sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Account a=new Account();
		System.out.println("***************************************************************************************************************");
		System.out.println("***************************************//^^~~~������ �����̶󱸿�~~~^^//***************************************");
		System.out.println("***************************************************************************************************************");
		System.out.println();
		System.out.println("(������ ���ϴ� 8�ڸ��� ���ڸ� �Է��϶�~  �� 8�ڸ��� ���ڰ� ���¹�ȣ�� �ȴٱ���~)");
		a.setaccount_No();
		System.out.println("(������ ���ϴ� 4�ڸ��� ���ڸ� �Է��϶�~  �� 4�ڸ��� ���ڰ� ��й�ȣ�� �ȴٱ���~)");
		a.setpasswd();
		a.setowner();
		a.setmoney();
		System.out.println("==============================================================================");
		System.out.println();

		String pass_test; // ��й�ȣ Ȯ���ϱ�
		String acc_test; // ���¹�ȣ Ȯ���ϱ�


		System.out.print("���¹�ȣ �Է��϶�! : ");
		acc_test=sc1.next();
		if (acc_test.equals(a.account_No)){
			System.out.print("��й�ȣ �Է��϶�! : ");
			pass_test=sc1.next();
			while (true)	{
				if (pass_test.equals(a.passwd)) {
					break;
				}
				else {
					System.out.println("��й�ȣ�� Ʋ�ȴٱ�!");
					pass_test=sc1.next();
				}
			}
			while (true)	{
					System.out.print("�Ա�/��� �������� �Ұųı���~ (�Ա�/���) : ");
					String ep=sc1.next();
						if (ep.equals("�Ա�")) {
							a.deposit();
						}
						else if (ep.equals("���")) {
							a.widthDraw();
						}
					System.out.print("�߰� �Ա�/��� �Ұųı���~~ (��/�ƴ�) : ");
					String ye=sc1.next();
						if (ye.equals("�ƴ�")){
								return;
						}
			}
		} else {
			System.out.println("���¹�ȣ�� Ʋ�ȴٱ�!");
		}

	} // main
} // class Account