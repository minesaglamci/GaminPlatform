package GamingPlatfform;

import java.time.LocalDate;
import java.util.ArrayList;

import GamingPlatfform.business.abstracts.CampaignService;
import GamingPlatfform.business.concretes.CampaignManager;
import GamingPlatfform.business.concretes.GameManager;
import GamingPlatfform.business.concretes.GamerManager;
import GamingPlatfform.business.concretes.SaleManager;
import GamingPlatfform.core.concretes.UserCheckManager;
import GamingPlatfform.dataAccess.concretes.hibernateImpls.GameHibernateDao;
import GamingPlatfform.dataAccess.concretes.hibernateImpls.GamerHibernateDao;
import GamingPlatfform.dataAccess.concretes.hibernateImpls.SaleHibernateDao;
import GamingPlatfform.dataAccess.concretes.jdbcImpls.CampaignJdbcDao;
import GamingPlatfform.entities.concretes.Campaign;
import GamingPlatfform.entities.concretes.Game;
import GamingPlatfform.entities.concretes.Gamer;
import GamingPlatfform.entities.concretes.Sale;

public class Main {

	public static void main(String[] args, CampaignService campaignService) {
		GamerManager gamerManager = new GamerManager(null, new GamerHibernateDao(), new UserCheckManager());

		Gamer gamer1 = new Gamer(1, "Mine", "Sağlamcı", "minesaglamci@gmail.com", "1234567891", LocalDate.of(1996, 2, 14), "vialin", "1593ms", null);
		gamerManager.add(gamer1);
		gamerManager.add(new Gamer(2, "Merve", "Yılmaz", "merveyilmaz@gmail.com", "2345678912", LocalDate.of(1995, 6, 21), "euphor", "4812my", null));
		gamerManager.add(new Gamer(3, "Büşra", "Özen", "busraozen@gmail.com", "3456789123", LocalDate.of(1994, 7, 13), "adornos", "2634bo", null));

		GameManager gameManager = new GameManager(new GameHibernateDao());
		Game game1 = new Game(1, "The Last Of Us", null, args, 300, 2017, 7, null);
		gameManager.add(game1);
		gameManager.add(new Game(2, "Minecraft", null, args, 550, 2004, 8, null));
		gameManager.add(new Game(3, "Grand Theft Auto", null, args, 1400, 2000, 6, null));

		CampaignManager campaignManager = new CampaignManager(new CampaignJdbcDao());
		Campaign campaign = new Campaign(1, "New Year", null, LocalDate.of(2022, 01, 01), LocalDate.of(2022, 01, 14), 20.0, null);
		campaignManager.add(campaign);

		SaleManager saleManager = new SaleManager(new SaleHibernateDao(), campaignService, campaign);
		Sale sale = new Sale(8, null, gamer1, campaign);
		sale.setCampaign(campaign);
		sale.setGame(game1);
		sale.setGamer(gamer1);
		saleManager.add(sale);
		saleManager.delete(sale);


	}

}
