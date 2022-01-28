package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.SaleDao;
import GamingPlatfform.entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + "numaralý satýþ jdbc'ye eklendi");			
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + "numaralý satýþ jdbc'den silindi");			
		
	}

}
