package kr.or.ddit.buyer.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.common.paging.PaginationInfo;

public class BuyerDAOImpl_template implements BuyerDAO {
	
	private SqlSession sqlSession;
	@Inject
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public BuyerVO selectBuyer(String buyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectTotalRecord(PaginationInfo paging) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BuyerVO> selectBuyerList(PaginationInfo paging) {
		return sqlSession.selectList("kr.or.ddit.buyer.dao.BuyerDAO.selectProperties");
	}

	@Override
	public int insertBuyer(BuyerVO buyer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBuyer(BuyerVO buyer) {
		// TODO Auto-generated method stub
		return 0;
	}

}
