package dao;

import java.util.List;

public interface DAO<Entity> {
	public void create(Entity entity);

    public void update(Entity entity);

    public void delete(String ID);

    public Entity read(String ID);

    public List<Entity> getAll();
}
