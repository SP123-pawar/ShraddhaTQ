package SetterGetter;

public class MyDate {
	int dd,mm,yy;
	//default constructor
	MyDate()
	{
		
		
	}
		MyDate(int d,int m,int y)
		{
			dd=d;
			mm=m;
			yy=y;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj=new MyDate();
		MyDate obj1= new MyDate(5,6,2024);
	}

}
