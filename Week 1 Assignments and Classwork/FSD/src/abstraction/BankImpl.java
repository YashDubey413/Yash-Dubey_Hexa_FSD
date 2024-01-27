package abstraction;

public class BankImpl implements IBank{
	public int balance=0;
	public void deposit() {
		balance+=10;
		System.out.println("Deposited 10rs according to your face");
		System.out.println("Your broke ass balance is Rs. "+balance);
	}
	
	public void withdraw() {
		balance-=5;
		System.out.println("Withdrew 5rs by seeing your face");
		System.out.println("Your broke ass balance is Rs. "+balance);
	}

}
