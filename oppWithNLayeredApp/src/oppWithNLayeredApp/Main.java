package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.ILogger;
import oppWithNLayeredApp.core.logging.MAilLogger;
import oppWithNLayeredApp.dataAccess.JdbcProductDa;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1  = new Product(1,"Iphone 11",1133);
		ILogger[] loggers= {new DatabaseLogger(), new FileLogger(),new MAilLogger()};
		
		ProductManager productManager= new ProductManager(new JdbcProductDa(),loggers); 
		productManager.add(product1);
		
		
		ILogger[] Loggers=  { new DatabaseLogger(), new FileLogger()};
		
		
		

	}

}
