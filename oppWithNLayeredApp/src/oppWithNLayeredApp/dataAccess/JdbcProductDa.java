package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;
								
public class JdbcProductDa implements ProductDao {
	
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır...SQL
		System.out.println("JDBC ile veritabanına eklendi");
		
		
		
		
		
	}

}
