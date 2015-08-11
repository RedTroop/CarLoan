package dao;

import java.util.List;

import connector.Connector;
import connector.carLoanDBConnector;

public abstract class DAOConnector<Entity> implements DAO<Entity> {

	protected Connector connector = new carLoanDBConnector();
	
	@Override
	public abstract void create(Entity entity);

	@Override
	public abstract void update(Entity entity);

	@Override
	public abstract void delete(String ID);

	@Override
	public abstract Entity read(String ID);

	@Override
	public abstract List<Entity> getAll();

	
	
}
