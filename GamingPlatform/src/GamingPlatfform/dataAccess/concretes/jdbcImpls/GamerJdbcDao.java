package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.GamerDao;
import GamingPlatfform.entities.concretes.Gamer;

public class GamerJdbcDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adl� oyuncu jdbc'ye eklendi");			
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adl� oyuncu jdbc'ye g�ncellendi");			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adl� oyuncu jdbc'den silindi");			
	}

}
