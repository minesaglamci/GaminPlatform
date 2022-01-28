package GamingPlatfform.dataAccess.concretes.hibernateImpls;

import GamingPlatfform.dataAccess.abstracts.GameDao;
import GamingPlatfform.entities.concretes.Game;

public class GameHibernateDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'e eklendi");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'e güncellendi");			
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'den silindi");			
	}

}
