package Concretes;

import Abstracts.CostumerService;
import Entities.Costumer;

public abstract class BaseCustomerManager implements CostumerService{

	@Override
	public void save(Costumer costumer) {

		System.out.println("Saved to db " + costumer.getFirstName());
	}

}
