import java.sql.* ;
class Connect1 {

	public static void main(String args[]){

		String url = "jdbc:mysql://localhost:3306/your_database";
		String username = "root";
		String password = "Dahiwad@123";

		String query = "SELECT * FROM MCA";

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password)  ;
			Statement stmt = con.createStatement() ;
			ResultSet rs = stmt.executeQuery(query) ;
			System.out.println("Connection Sucessfully !!");
			while(rs.next()){

				System.out.println("ID : " + rs.getString(1) + "Name : " + rs.getString(2) + "Marks : " + rs.getString(3));
			}

		}catch(SQLException se){

			se.printStackTrace();
		}catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found! Please check if MySQL Connector/J is added to the classpath.");
            e.printStackTrace();
        }


	}
}