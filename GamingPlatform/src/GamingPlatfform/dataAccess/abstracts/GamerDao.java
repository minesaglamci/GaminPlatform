package GamingPlatfform.dataAccess.abstracts;

import GamingPlatfform.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
