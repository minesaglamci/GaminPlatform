package GamingPlatfform.dataAccess.abstracts;

import GamingPlatfform.entities.concretes.Sale;

public interface SaleDao {
	void add(Sale sale);
	void delete(Sale sale);
}
