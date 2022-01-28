package GamingPlatfform.business.concretes;

import GamingPlatfform.business.abstracts.CampaignService;
import GamingPlatfform.dataAccess.abstracts.CampaignDao;
import GamingPlatfform.entities.concretes.Campaign;
import GamingPlatfform.entities.concretes.Game;

public class CampaignManager implements CampaignService{
	private CampaignDao campaignDao;
	private Game game;

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaign.setPercentageOfDiscount(campaign.getPercentageOfDiscount()/100);
		this.campaignDao.add(campaign);			
	}

	@Override
	public void update(Campaign campaign) {
		campaign.setPercentageOfDiscount(campaign.getPercentageOfDiscount()/100);
		this.campaignDao.update(campaign);		
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);		
	}
	
	

}
