package kr.or.ddit.container;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import kr.or.ddit.dummy.service.DummyServiceImpl;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringJUnitWebConfig(locations = "file:src/main/resources/kr/or/ddit/spring/conf/*-context.xml")
class RootContainerTest {
	@Inject
	DummyServiceImpl dummy;
	
	@Resource(name = "dataSource")
	DataSource dataSource;
	@Inject
	@Named("sqlSessionFactory")
	SqlSessionFactory sqlSessionFactory;
	@Autowired
	SqlSession sqlSessionTemplate;
	
	@Test
	void test() {
		log.info("주입된 객체 : {}", dummy);
	}
	
	@Test
	void test2() throws SQLException {
		log.info("dataSource : {}", dataSource);
		log.info("Connection : {}", dataSource.getConnection());
		log.info("sqlSessionFactory : {}", sqlSessionFactory);
		log.info("sqlSessionTemplate : {}", sqlSessionTemplate);
	}

}
