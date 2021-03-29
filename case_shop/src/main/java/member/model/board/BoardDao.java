package model.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BoardAlias")
public class BoardDao {
	private String namespace = "model.board.Board";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

}
