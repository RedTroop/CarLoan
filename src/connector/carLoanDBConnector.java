package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.DAO;
import dao.DAOConnector;
import dao.DAODipendente;
import dao.DAOFactory;
import entity.Dipendente;

public class carLoanDBConnector implements Connector {

	private Connection connessione = null;

	@Override
	public ResultSet executeReadQuery(String query) {

		return null;
	}

	@Override
	public ResultSet executeUpdateQuery(String query) {
		Statement statement = null;

		ResultSet queryUpdateResult = null;

		try {

			statement = connessione.createStatement();
			statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
			queryUpdateResult = statement.getGeneratedKeys();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// restituisce le tuple inserite/modificate
		return queryUpdateResult;
	}

	public carLoanDBConnector() {
		connect();
	}

	public void connect() {

		try {
			new com.mysql.jdbc.Driver();

			connessione = DriverManager.getConnection(
					"jdbc:mysql://localhost/carloan", "utente", "utente");

			System.out.println("Database Connected! :D");

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Database NOT Connected! :(");
		}
	}

	public static void main(String[] args) {
		//carLoanDBConnector connector = new carLoanDBConnector();

		Dipendente gino = new Dipendente("Matteo", "Lity", "ABCDEFGIILMNOjQS", "MatteoGay", "SonoGay", 1);
		int a = gino.getId_agenzia();
		System.out.println(a);
		
		DAO<Object> DAOInstance = DAOFactory.getDAOEntity("Dipendente");
            
        DAOInstance.create(gino);
        
	}

}
