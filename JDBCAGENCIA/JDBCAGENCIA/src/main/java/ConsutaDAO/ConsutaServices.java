package ConsutaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsutaServices {

	public void save(String origem, String destino, String entrada, String saída) throws Exception {
	 String sql = "INSERT TO consuta (Origem, Destino, Entrada, Saída) VALUES (?, ?, ?, ?) ";
	 
	 Connection conn = null;
	 PreparedStatement pstn = null;
	 
	 conn = ConexaoBanco.createConnection();
	 pstn = conn.prepareStatement(sql);
	 pstn.setString(1, origem);
	 pstn.setString(2, destino);
	 pstn.setString(3, entrada);
	 pstn.setString(4, saída);
	
	 pstn.execute();
	 
	try {
		
	} catch(Exception ex) {
		System.out.println(ex.getMessage());
	} finally {
	 if (conn != null) {
		conn.close();
		
	}  if (pstn != null) {
		pstn.close();
}
	}
		
	}
	

		


	public void save(String string) {
		// TODO Auto-generated method stub
	
	
	}
}




