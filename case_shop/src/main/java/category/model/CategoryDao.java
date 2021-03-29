package category.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CategoryAlias")
public class CategoryDao {
	private String namespace = "category.model.Category";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
