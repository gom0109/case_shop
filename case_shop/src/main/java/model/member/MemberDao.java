package model.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MemberAlias")
public class MemberDao {

	private String namespace = "model.member.Member";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;


}
