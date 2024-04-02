package kr.or.ddit.buyer.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.common.paging.PaginationInfo;
import lombok.extern.slf4j.Slf4j;
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/kr/or/ddit/spring/conf/*-context.xml")
@Slf4j
class BuyerDAOTest {
	@Inject
	BuyerDAO dao;
	@Test
	void test() {
		PaginationInfo paging = new PaginationInfo();
		paging.setCurrentPage(1);
		dao.selectBuyerList(paging);
	}

}
