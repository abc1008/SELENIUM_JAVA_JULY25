package encapsulation_demo;

public class ATM_Room
{
	
	public static void main(String[] args)
	{
		Bank_Account ac = new Bank_Account();
		int accBal = ac.getBalance();
		
		System.out.println(accBal);
		
//		ac.acc_bal = 5000;
	}
	
	

}
