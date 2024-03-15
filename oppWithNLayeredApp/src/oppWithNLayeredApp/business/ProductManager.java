package oppWithNLayeredApp.business;
import java.util.List;
import oppWithNLayeredApp.core.logging.ILogger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.JdbcProductDa;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private ILogger  [] loggers;
	
	
	


	public ProductManager(ProductDao productDao,ILogger[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
	}




	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {

			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		

		productDao.add(product);
		
		for (ILogger logger : loggers) {//db,mail
			logger.log(product.getName());
		}

	}

}
