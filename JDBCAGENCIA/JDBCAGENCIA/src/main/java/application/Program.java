package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/consultas";
		Connection conn = DriverManager.getConnection(url, "root", "Canetapreta");
		System.out.println("Voc� deseja fazer uma consulta? S/N");
		String resposta = sc.next();
		String Origem = "";
		String Destino = "";
		String Entrada = "";
		String Sa�da = "";
		if(resposta.equals("S")) {
			System.out.println("Qual sua origem");
			Origem = sc.next();
			
			System.out.println("Qual seu destino");
			Destino = sc.next();
			
			System.out.println("Entrada");
			Entrada = sc.next();
			
			System.out.println("Sa�da");
			Sa�da = sc.next();
			
		} else {
			System.out.println("Obrigada por consultar");
		}
		
		try {
			
	  PreparedStatement ps = conn.prepareStatement("INSERT INTO Consuta (UPDATE Consuta SET Origem = ?, Destino = ?, Entrada = ?, Sa�da = ? WHERE Id_Consultas = ?");
		 ps.setString(1, Origem);
		 ps.setString(2, Destino);
		 ps.setString(3, Entrada);
		 ps.setString(4, Sa�da);
		 ps.setInt(5,1);
		 ps.execute();
		 
		 
		 
		} catch (SQLException e) {
			e.getMessage();
	   } finally {
		conn.close();
		
	}

}
}
