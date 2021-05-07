package Concretes;

import Abstracts.CustomerCheckService;
import Entities.Costumer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Costumer costumer) {

		return true;
	}

}
