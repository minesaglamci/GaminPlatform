package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.GamerDao;
import GamingPlatfform.entities.concretes.Gamer;

public class GamerJdbcDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu jdbc'ye eklendi");			
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu jdbc'ye güncellendi");			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu jdbc'den silindi");			
	}

}
