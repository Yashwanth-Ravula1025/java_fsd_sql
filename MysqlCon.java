package UST_BATCHNO_3.JDBCSQL;

import java.sql.*;

public class MysqlCon{  
	
public static void main(String args[]){ 
	
	try{  
	
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/yashwanth","root","pass@word1"); 

//here sonoo is database name, root is username and password 

		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from customer");  

	while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getLong(3));  
	con.close();  
	}
	catch(Exception e){ 
		System.out.println(e);
	}  
}  
}