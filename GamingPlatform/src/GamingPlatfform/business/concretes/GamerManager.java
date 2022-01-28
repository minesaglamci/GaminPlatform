package GamingPlatfform.business.concretes;



import java.util.ArrayList;

import GamingPlatfform.business.abstracts.GamerService;
import GamingPlatfform.core.abstracts.UserCheckService;
import GamingPlatfform.core.abstracts.UserCheckService;
import GamingPlatfform.dataAccess.abstracts.GamerDao;
import GamingPlatfform.entities.concretes.Gamer;

public class GamerManager implements GamerService{
	ArrayList<Gamer> gamers= new ArrayList<Gamer>();
	private GamerDao gamerDao;
	private UserCheckService userCheckService;
	
	

public GamerManager(ArrayList<Gamer> gamers, GamerDao gamerDao, UserCheckService userCheckService) {
		super();
		this.gamers = gamers;
		this.gamerDao = gamerDao;
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
