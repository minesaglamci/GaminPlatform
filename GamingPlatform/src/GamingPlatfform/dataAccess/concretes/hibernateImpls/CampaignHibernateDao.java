package GamingPlatfform.dataAccess.concretes.hibernateImpls;

import GamingPlatfform.dataAccess.abstracts.CampaignDao;
import GamingPlatfform.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya hibernate'e eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya hibernate'e güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya hibernate'den silindi");
		
	}

}
