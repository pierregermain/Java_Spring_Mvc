package process;

import java.sql.SQLException;

public class Processor {
	public String processName(String str) throws SQLException, ClassNotFoundException {
		
		DatabaseActions db = new DatabaseActions();
		String conectado = db.conectar();
		
		return "status="+conectado + " Mr. "+str+" your name has "+str.length()+" characters";
	}
}
