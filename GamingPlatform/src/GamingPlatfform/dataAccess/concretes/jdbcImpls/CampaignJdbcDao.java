package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.CampaignDao;
import GamingPlatfform.entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� jdbc'ye eklendi.");		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� jdbc'ye g�ncellendi.");			
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� jdbc'den silindi.");			
	}

}
