package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entities.Product;

public class HibernateProductDao  implements ProductDao{
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır...Hibernat
		System.out.println("Hibernate ile veritabanına eklendi");
		
		
		
		
		
	}
}
