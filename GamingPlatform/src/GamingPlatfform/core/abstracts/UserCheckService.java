package GamingPlatfform.core.abstracts;

import GamingPlatfform.entities.concretes.Gamer;

public interface UserCheckService {
	boolean CheckIfRealPerson(Gamer gamer);
	}
