package jdbcTutorial;
import  java.sql.*;
public class Tut {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/crudproject";
		String user="root";
		String pass ="12345678";
		try {
		Connection con = DriverManager.getConnection(url, user, pass);
		
		Statement st =con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from jdbcDemo where roll=59");
		
		rs.next();
			
			int  roll=rs.getInt("roll");
			String Name = rs.getString("Name");
			String Section =rs.getNString("Section");
			
			System.out.println("roll:"+roll+"\tName:"+Name+"\tSec:"+Section);	
			
		
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
