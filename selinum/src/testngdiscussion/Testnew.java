package testngdiscussion;

import org.testng.annotations.Test;

public class Testnew {
	
	

	
 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
public void admin()
 {
		System.out.println("admin");
 }
	@Test(priority=2)
	public void login()
	 {
		
			System.out.println("login");
	 }
	 @Test(priority=4)
	public void Dashbord()
	 {
		
			System.out.println("dashbord");
	 }
	
}


