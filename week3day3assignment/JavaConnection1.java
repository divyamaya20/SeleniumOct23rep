package week3day3assignment;

public class JavaConnection1 extends MySqlConnection {
	
	public static void main(String[] args) {
		
		JavaConnection1 obj=new JavaConnection1();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();
	}

}
