package board.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BoardAlias")
public class BoardDao {
	private String namespace = "board.model.Board";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
