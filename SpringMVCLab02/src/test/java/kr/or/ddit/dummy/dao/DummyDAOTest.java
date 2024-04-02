package kr.or.ddit.dummy.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import kr.or.ddit.vo.CartVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/kr/or/ddit/spring/conf/*-context.xml")
class DummyDAOTest {
	@Inject
	DummyDAO dao;
	
	@Inject
	SqlSession sqlsession;
	
	@Test
	void testSelectCartList() {
		DummyDAO Dummy = sqlsession.getMapper(DummyDAO.class);
		List<CartVO> list = Dummy.selectCartList();
		log.info("list : {}", list);
	}

}
