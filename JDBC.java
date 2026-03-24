import java.sql.*;
class JDBC{

public static void main(String args[]) throws Exception{

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kbcnmu1","root","Dahiwad@123");
	Statement stmt=conn.createStatement();
	stmt.execute("create table student(id int,name varchar(20),marks int)");





	}






	}