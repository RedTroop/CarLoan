package dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



import entity.Dipendente;
import dao.QueryStringReplacer;


public class DAODipendente extends DAOConnector<Dipendente> {

	private static final String INSERT_QUERY = "INSERT INTO dipendente(nome_dipendente, cognome_dipendente, cf_dipendente, user_dipendente,"
			+ "pw_dipendente, agenzia_dipendente) VALUES ('?', '?', '?', '?', '?', '?')";
	

	@Override
	public void create(Dipendente entity) {
		
		String insertQuery = INSERT_QUERY;
		String attDipendente = null;
		
		attDipendente = entity.getNome();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		attDipendente = entity.getCognome();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		attDipendente = entity.getCf();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		attDipendente = entity.getUsername();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		attDipendente = entity.getPassword();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		attDipendente = Integer.toString(entity.getId_agenzia());
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, attDipendente);
		
		connector.executeUpdateQuery(insertQuery);
		
	}

	@Override
	public void update(Dipendente entity) {



	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dipendente read(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dipendente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}