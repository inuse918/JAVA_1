import java.util.*;
class Account{
	Scanner sc=new Scanner(System.in);
	private String account_No; // 계좌번호
	private String passwd; // 비밀번호
	private String owner; // 예금주
	private int balance; // 잔고

	public void setaccount_No()	{
		System.out.print("계좌번호 설정을 하라구우~ : ");
		account_No=sc.next();
	} // 계좌번호 설정
	public void deposit() {
		System.out.print("입금할 금액을 입력하라구우~ : ");
		balance+=sc.nextInt();
		System.out.println("잔액은 "+balance+" 원 이라구~(찡긋)");
	} // 입금
	public void widthDraw() {
		System.out.print("출금할 금액을 입력하라구우~ : ");
		int wid_money=sc.nextInt();
	
			if (wid_money>balance) {
				System.out.println("잔액이 부족하다구우~ ");
			}
			else if (wid_money==balance){
				balance-=wid_money;
				System.out.println("잔액은 0원이라구~");
			}
			else {
				balance-=wid_money;
				System.out.println("잔액은 "+balance+" 원 이라구~(찡긋)");
			}
	} // 출금

	public void setpasswd(){
		System.out.print("비밀번호 설정하라구우~ : ");
			passwd=sc.next();
	} // 비밀번호 설정
	
	public void setowner(){
		System.out.print("예금주 설정하라구우~ : ");
		owner=sc.next();
	} // 예금주 설정

	public void setmoney(){
		System.out.print("잔고 설정하라구우~ : ");
		balance=sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Account a=new Account();
		System.out.println("***************************************************************************************************************");
		System.out.println("***************************************//^^~~~다희의 은행이라구우~~~^^//***************************************");
		System.out.println("***************************************************************************************************************");
		System.out.println();
		System.out.println("(본인이 원하는 8자리의 숫자를 입력하라구~  그 8자리의 숫자가 계좌번호가 된다구우~)");
		a.setaccount_No();
		System.out.println("(본인이 원하는 4자리의 숫자를 입력하라구~  그 4자리의 숫자가 비밀번호가 된다구우~)");
		a.setpasswd();
		a.setowner();
		a.setmoney();
		System.out.println("==============================================================================");
		System.out.println();

		String pass_test; // 비밀번호 확인하기
		String acc_test; // 계좌번호 확인하기


		System.out.print("계좌번호 입력하라구! : ");
		acc_test=sc1.next();
		if (acc_test.equals(a.account_No)){
			System.out.print("비밀번호 입력하라구! : ");
			pass_test=sc1.next();
			while (true)	{
				if (pass_test.equals(a.passwd)) {
					break;
				}
				else {
					System.out.println("비밀번호가 틀렸다구!");
					pass_test=sc1.next();
				}
			}
			while (true)	{
					System.out.print("입금/출금 무엇으로 할거냐구우~ (입금/출금) : ");
					String ep=sc1.next();
						if (ep.equals("입금")) {
							a.deposit();
						}
						else if (ep.equals("출금")) {
							a.widthDraw();
						}
					System.out.print("추가 입금/출금 할거냐구우~~ (응/아니) : ");
					String ye=sc1.next();
						if (ye.equals("아니")){
								return;
						}
			}
		} else {
			System.out.println("계좌번호가 틀렸다구!");
		}

	} // main
} // class Account