package GamingPlatfform.business.concretes;

import GamingPlatfform.business.abstracts.CampaignService;
import GamingPlatfform.business.abstracts.SaleService;
import GamingPlatfform.dataAccess.abstracts.SaleDao;
import GamingPlatfform.entities.concretes.Campaign;
import GamingPlatfform.entities.concretes.Sale;

public class SaleManager implements SaleService{
	private SaleDao saleDao;
	private CampaignService campaignService;
	private Campaign campaign;
	

	public SaleManager(SaleDao saleDao, CampaignService campaignService, Campaign campaign) {
		super();
		this.saleDao = saleDao;
		this.campaignService = campaignService;
		this.campaign = campaign;
	}

	@Override
	public void add(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub
		
	}

}
