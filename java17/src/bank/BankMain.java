package bank;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
		int money = Integer.parseInt(JOptionPane.showInputDialog("보유금액"));
		Bank ban = new Bank();
		ban.getmoney(money);
		
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		GoodBank good = new GoodBank();
		
		double badresult = bad.getInterestRate()*ban.money;
		double normalresult = normal.getInterestRate()*ban.money;
		double goodresult = good.getInterestRate()*ban.money;
		
		
		System.out.println("나쁜은행 이자 : "+(int)badresult+"원");
		System.out.println("보통은행 이자 : "+(int)normalresult+"원");
		System.out.println("좋은은행 이자 : "+(int)goodresult+"원");
	}

}
