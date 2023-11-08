package week3day3assignment;

public abstract class MySqlConnection implements DataBaseConnection{

	public void connect() {
	
		System.out.println("Connected");	
		
	}

	public void disconnect() {
		
		System.out.println("Disconnected");
				
	}

	public void executeUpdate() {
		
		System.out.println("Update executed");
		
	}
	
	public void executeQuery() {
		System.out.println("query executed");
	}
	
	

}
