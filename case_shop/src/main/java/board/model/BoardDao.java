package board.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BoardAlias")
public class BoardDao {
	private String namespace = "board.model.Board";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public List<BoardBean> getList() {
		List<BoardBean> boardList = sqlSessionTemplate.selectList(namespace+".getList");
		return boardList;
	}

	public int insert(BoardBean boardBean) {
		int cnt = sqlSessionTemplate.insert(namespace+".insert", boardBean);
		return cnt;
	}

	public BoardBean getOne(int boardNum) {
		BoardBean board = sqlSessionTemplate.selectOne(namespace+".getOne", boardNum);
		return board;
	}

	public int update(BoardBean boardBean) {
		int cnt = sqlSessionTemplate.update(namespace+".update", boardBean);
		return cnt;
	}

	public int remove(int boardNum) {
		int cnt = sqlSessionTemplate.delete(namespace+".delete", boardNum);
		return cnt;
	}
}
