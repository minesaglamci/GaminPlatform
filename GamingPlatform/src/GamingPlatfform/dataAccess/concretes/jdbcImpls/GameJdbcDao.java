package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.GameDao;
import GamingPlatfform.entities.concretes.Game;

public class GameJdbcDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyun jdbc'ye eklendi");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adlý oyun jdbc'ye güncellendi");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adlý oyun jdbc'den silindi");		
	}

}
