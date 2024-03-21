package SetterGetter;

public class TestDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datedemo obj=new Datedemo();
		
		obj.setDd(8);
		System.out.println(obj.getDd());
		obj.setMm(2);
		obj.getYy();
		obj.setDd(202);
		obj.getDd();
		System.out.println("Date is"+obj.getDd());
	}

}
