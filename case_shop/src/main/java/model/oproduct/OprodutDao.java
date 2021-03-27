package model.oproduct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("OproductAlias")
public class OprodutDao {
	private String namespace = "model.oproduct.Oproduct";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
