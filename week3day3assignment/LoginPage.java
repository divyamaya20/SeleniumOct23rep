package week3day3assignment;

public class LoginPage extends BasePage {

	
public void performCommonTasks(String url, boolean refresh){
    	
    	System.out.println("The entered URL cannot be loaded  ");
    	System.out.println("Refresh done = " + refresh);
}
    	

public static void main(String[] args) {
	LoginPage obj= new LoginPage();
	obj.findElement();
	obj.clickElement();
	obj.enterText();
	obj.performCommonTasks("https://www.testleaf.com/", true);
	
	
}

}
