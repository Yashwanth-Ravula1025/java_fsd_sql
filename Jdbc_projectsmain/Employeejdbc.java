package ustbatchno3.Jdbc_projects;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;



	/**
	 * Hello world!
	 *
	 */
	public class Employeejdbc {
	
	    public static void main( String[] args)
	    {
	    	try{  
	    		Class.forName("com.mysql.jdbc.Driver");  
	    		Connection con=DriverManager.getConnection(  
	    		"jdbc:mysql://localhost:3306/meenakshi1","root","pass@word1");  
	    		//here meenakshi is database name, root is username and password  
	    		Statement stmt= con.createStatement();  
//	    		ResultSet rs= stmt.executeQuery("CREATE TABLE Employee ( name VARCHAR(10),age INT,department VARCHAR(10));");
//	    		while(rs.next())  
//	    		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
	    		
	    		// database creation
//	    		String sql="create database meenakshi1 ";
//	    		stmt.execute(sql);
//	    		System.out.println("database created successfully");
	    		
	    		// table creation
	    		String sql="create table employee(name varchar(10), age INT,department varchar(10))  ";
	    		stmt.execute(sql);
	    		System.out.println("table created successfully");
	    		con.close();  
	    		}catch(Exception e){ System.out.println(e);}  
	    }
	}


