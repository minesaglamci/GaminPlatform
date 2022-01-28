package GamingPlatfform.dataAccess.concretes.jdbcImpls;

import GamingPlatfform.dataAccess.abstracts.SaleDao;
import GamingPlatfform.entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + "numaral� sat�� jdbc'ye eklendi");			
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + "numaral� sat�� jdbc'den silindi");			
		
	}

}
