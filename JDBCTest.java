package hello;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManger.getConnection(
					"jdbc:mysql://localhost:3306/?user=root");
			String
			
		}
	}

}
