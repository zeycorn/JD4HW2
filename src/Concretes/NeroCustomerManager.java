package Concretes;

import Abstracts.CustomerCheckService;
import Entities.Costumer;

public class NeroCustomerManager  extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	public void save(Costumer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			System.out.println("No customer found");
		}

}
}
