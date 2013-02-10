import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMySQL extends javax.swing.JFrame{

	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		
		
		try {

			String connectionURL = "jdbc:mysql://lmsaoulos.dyndns-at-home.com:3306/soften";
			String username = "XXXXX";  ////Oi kvdikoi gia online sto mail
			String password = "XXXXX";  ////Gia localhost username: root password: toor

			conn = DriverManager.getConnection(connectionURL, username,
					password);
			
			stmt = conn.createStatement();
			stmt2 = conn.createStatement();
			stmt3 = conn.createStatement();
			stmt4 = conn.createStatement();
			
			//String data = "insert into Buss values ('KIB9971','Scania',333,321,0)";
			
			//stmt4.executeUpdate(data);
		
			rs = stmt.executeQuery("select * from employees");
			while (rs.next()) {
				
				String Name = rs.getString("Name");
				String Surname = rs.getString("Surname");
				String Rights = rs.getString("Rights");
				String Phone = rs.getString("Phone");
				String ID = rs.getString("ID");
				String Username = rs.getString("Username");
				String Password = rs.getString("Password");
				
				System.out.println("Name: " + Name +" Surname: " + Surname+ " Rights: " + Rights+ " Phone: " + Phone+ " ID: " + ID + " Username: " + Username + " Password: " + Password);
				
				}
			
			rs2 = stmt2.executeQuery("select * from Buss");
			while (rs2.next()) {
				
				String Plate = rs2.getString("Plate");
				String Model = rs2.getString("Model");
				String Driver_ID = rs2.getString("Driver_ID");
				String Buss_ID = rs2.getString("Buss_ID");
				String Functional = rs2.getString("Functional");
				
				System.out.println("Plate: " + Plate +" Model: " + Model+ " Driver_ID: " + Driver_ID+ " Buss_ID: " + Buss_ID+ " Functional: " + Functional);
				
				}
			
			rs3 = stmt3.executeQuery("select * from Routes");
			while (rs3.next()) {
				
				String Driver_ID = rs3.getString("Driver_ID");
				String Buss_ID = rs3.getString("Buss_ID");
				String Date = rs3.getString("Date");
				String Dromologio = rs3.getString("Dromologio");
				
				System.out.println("Driver_ID: " + Driver_ID +" Buss_ID: " + Buss_ID+ " Date: " + Date+ " Dromologio: " + Dromologio);
				
				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
	} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (stmt != null)
					try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (rs2 != null)
					try {
						rs2.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (stmt2 != null)
						try {
						stmt2.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (rs3 != null)
						try {
							rs3.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (stmt3 != null)
							try {
							stmt3.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (stmt4 != null)
							try {
							stmt4.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
