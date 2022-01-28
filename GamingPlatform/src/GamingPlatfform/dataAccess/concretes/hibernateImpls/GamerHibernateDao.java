package GamingPlatfform.dataAccess.concretes.hibernateImpls;

import GamingPlatfform.dataAccess.abstracts.GamerDao;
import GamingPlatfform.entities.concretes.Gamer;

public class GamerHibernateDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu hibernate'e eklendi");				
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu hibernate'e güncellendi");			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getNickname() + " adlý oyuncu hibernate'den silindi");			
	}

}
