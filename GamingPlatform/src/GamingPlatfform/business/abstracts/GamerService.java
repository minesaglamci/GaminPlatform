package GamingPlatfform.business.abstracts;

import GamingPlatfform.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

}
