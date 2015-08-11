package dao;

import entity.Dipendente;

public class DAOFactory {

	private static final String PATH = "dao.DAO";

	public static <Entity> DAO<Entity> getDAOEntity(String DAOName) {

		Class<?> DAOClass = null;
		DAO<Entity> DAOInstance = null;
		
		try {
			DAOClass = Class.forName(getDAOName(DAOName));
			DAOInstance = (DAO<Entity>) DAOClass.newInstance();
			System.out.println(DAOInstance.getClass());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return DAOInstance;
	}

	public static String getDAOName(String DAOName) {

		return PATH + DAOName;
	}

}
