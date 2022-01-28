package GamingPlatfform.dataAccess.concretes.hibernateImpls;

import GamingPlatfform.dataAccess.abstracts.SaleDao;
import GamingPlatfform.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + "numaral� sat�� hibernate'e eklendi");		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + "numaral� sat�� hibernate'den silindi");			
	}

}
