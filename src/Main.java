

import Adapters.MernisServiceAdapter;
import Concretes.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Costumer;

public class Main {

	public static void main(String[] args) {


	    Costumer customer2 = new Costumer(1, "Zeynep", "Citlak", 1111, "1111");
	    
	    BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
    	customerManager1.save(customer2);    
    	
	}

}
