package model.orders;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("OrdersAlias")
public class OrdersDao {
	private String namespace = "model.orders.Orders";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
