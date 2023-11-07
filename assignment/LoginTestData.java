package week3.day2.assignment;

public class LoginTestData extends TestData {
	
	
	String password;
	
	public void enterUsername(String userName) {
		
		System.out.println("The username is "+ userName);
	}
	
	public void enterPassword(String password){
		
		System.out.println("The password is " + password);
		
	}

	public static void main(String[] args) {
		
		LoginTestData details=new LoginTestData();
		details.enterCredentials();
		details.enterUsername("divya123");
		details.enterPassword("pass123");
		details.navigateToHomePage();
	}
}
