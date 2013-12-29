package process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseActions {

private static final String USER = "root"	;
private static final String PWD = "m1234m"	;
private static final String CONNECT = "jdbc:mysql://localhost/h3rv1d34s"	;

	
	
	public String conectar() throws SQLException, ClassNotFoundException{
		
		String conectado = "";
		Connection	conn = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection(CONNECT, USER, PWD);
			System.err.println(">> conectar()");
			conectado = " ha entrado ";

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(" <> catch");
			System.err.println(e);
			conectado ="en el catch";
		}
		finally{
			if(conn !=null){
				conn.close();
				conectado = conectado + " ha closeado ";
			}
		}
		return conectado;
	}

}
