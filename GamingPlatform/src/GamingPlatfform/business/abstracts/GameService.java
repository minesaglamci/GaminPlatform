package GamingPlatfform.business.abstracts;

import GamingPlatfform.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);

}
