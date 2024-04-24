import java.sql.*;
class Main {
	public static void main(String args[]) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "");
			Statement stmt = con.createStatement();

			// fetch or show or read data
			// ResultSet result = stmt.executeQuery("SELECT * FROM collage");
			// while(rs.next()) {
			// 	System.out.println(rs);
			//	System.out.println(rs.getInt(1)+" "+rs.getString(2))
			// }

			// insert data 
			int result = stmt.executeUpdate("INSERT INTO student (id, name, roll, address) VALUES (3, 'Payel Sarkar', 145, 'Saltlake, Kolkata')");

			// delete data 
			int result = stmt.executeUpdate("DELETE FROM student WHERE id = 3");

			// update data 
			int result = stmt.executeUpdate("UPDATE student SET roll = 40 WHERE id = 1");


			con.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}


loader
driverManager
connection
operation
close