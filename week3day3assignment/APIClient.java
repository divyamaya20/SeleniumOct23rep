package week3day3assignment;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		
		System.out.println("APIClient endpoint is  " + endPoint);
	}
	
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus  ) {
	
		System.out.println("APIClient endpoint is  " + endPoint);
		System.out.println("Username entered is " + requestBody );
		System.out.println("Request Sent = " + requestStatus );
		
	}
	
	public static void main(String[] args) {
		
		APIClient obj= new APIClient();
		obj.sendRequest("https://www.testleaf.com/");
		System.out.println("===========================");
		obj.sendRequest("https://platform.testleaf.com/#/", "Leaf@86912", true);
	}

}
