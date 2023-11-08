package week3day3assignment;

public class JavaConnection implements DataBaseConnection {

	public void connect() {
		
		System.out.println("Connection established");
		
		}

	public void disconnect() {
		
		System.out.println("Connection disconnected ");
		
		}

	public void executeUpdate() {
		
		System.out.println("Update execution done");
		
		}
	
	public static void main(String[] args) {
	
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		
}
}
