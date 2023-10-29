package week1.day1;

public class Browser {
	
	
	public String launchBrowser(String browserName) {
		
		System.out.println(browserName +" launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		
		System.out.println("Application URL loaded successfully");
	}

public static void main(String[] args) {
		//assignment 1
		Chrome obj=new Chrome();
		obj.getName();
		obj.PrintName();
		
		//assignment 3
		
		Browser obj1= new Browser();
		obj1.launchBrowser("Google");
		obj1.loadUrl();
		
		
		}
}
