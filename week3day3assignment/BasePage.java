package week3day3assignment;

public class BasePage {

	public void findElement(){
		
		System.out.println("The element found");
		
	}
	
    public void clickElement(){
    	
    	System.out.println("The element clicked");
		
	}
    
    public void enterText(){
    	
    	System.out.println("Text entered");
		
	}
    
    public void performCommonTasks(String url, boolean refresh){
    	
    	System.out.println("URL entered is " + url);
    	System.out.println("Refresh done = " + refresh);
    	
		
	}
    
    public static void main(String[] args) {
		
    	BasePage obj=new BasePage();
    	obj.findElement();
    	obj.clickElement();
    	obj.enterText();
    	obj.performCommonTasks("https://www.testleaf.com/", false);
    	
	}


}
