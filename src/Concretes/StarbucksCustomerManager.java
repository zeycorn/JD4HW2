package Concretes;

import Abstracts.CustomerCheckService;
import Entities.Costumer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Costumer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" No customer found");
		}
		
	}
	
}
