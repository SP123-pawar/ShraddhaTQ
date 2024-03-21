package SetterGetter;

public class Datedemo {
	private int dd,mm,yy;
	
	Datedemo()
	{
		System.out.println("I am a default constructor");
		dd=5;
		mm=2;
		yy=2024;
	}
	public void setDd(int d)
	{
		dd=d;
		
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int m)
	{
		mm=m;
		
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public void setYy(int y)
	{
		yy=y;
		
	}
	
	public void show()
	{
		System.out.println("Date is "+dd+"/"+mm+"/"+yy);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Datedemo obj;
			obj=new Datedemo();
			obj.dd=5;
			obj.mm=2;
			obj.yy=2024;
			obj.show();

	}

}
