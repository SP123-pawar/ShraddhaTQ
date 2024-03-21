package SetterGetter;

public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public void setAccNo(int acn)
	{
	 accNo=acn;
	}
	public int getAccNo()
	{
		return accNo;
	}
	
	public void setOwnerName(String name)
	{
		ownerName=name;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	
	public void setBalance(double bln)
	{
		balance=bln;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj;
		obj=new Account();
		obj.accNo=1234;
		obj.ownerName=riya;
		obj.balance=50000;
		obj.show();
		
				
	}

}
