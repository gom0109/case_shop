package oproduct.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("OproductAlias")
public class OprodutDao {
	private String namespace = "oproduct.model.Oproduct";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
