package GamingPlatfform.core.concretes;

import java.rmi.RemoteException;

import GamingPlatfform.core.abstracts.UserCheckService;
import GamingPlatfform.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		KPSPublicSoap proxy = new KPSPublicSoapProxy();
		
		try {
			return proxy.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalIdentity()).longValue(),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {

			return false;
		}
	}
}
