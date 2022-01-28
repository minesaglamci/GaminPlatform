package GamingPlatfform.business.concretes;

import GamingPlatfform.business.abstracts.GameService;
import GamingPlatfform.dataAccess.abstracts.GameDao;
import GamingPlatfform.entities.concretes.Game;

public class GameManager implements GameService{
	private GameDao gameDao;
	

	public GameManager(GameDao gameDao) {
		super();
		this.setGameDao(gameDao);
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

	public GameDao getGameDao() {
		return gameDao;
	}

	public void setGameDao(GameDao gameDao) {
		this.gameDao = gameDao;
	}

}
