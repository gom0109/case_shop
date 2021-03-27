package model.product;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ProductAlias")
public class ProductDao {
	private String namespace = "model.product.Product";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
