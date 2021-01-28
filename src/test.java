import com.controller.demo.dao.imp.ProductsDaoJdbcImp;
import com.controller.demo.service.imp.ProductsServiceImp;

public class test {

	public static void main(String[] args) {
		ProductsServiceImp a=new ProductsServiceImp();
		System.out.println(a.queryByCategory("HandPhone"));

	}

}
