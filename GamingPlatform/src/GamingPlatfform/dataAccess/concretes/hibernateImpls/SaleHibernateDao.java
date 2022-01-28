package GamingPlatfform.dataAccess.concretes.hibernateImpls;

import GamingPlatfform.dataAccess.abstracts.SaleDao;
import GamingPlatfform.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + "numaralý satýþ hibernate'e eklendi");		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + "numaralý satýþ hibernate'den silindi");			
	}

}
