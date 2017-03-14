package yjc.wdb.bbs.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import yjc.wdb.bbs.bean.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {
	private static final String namespace = "yjc.wdb.bbs.Mapper";
	
	@Inject
	private SqlSession sqlSession;
	@Override
	public void create(Board vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".create", vo );
	}

	@Override
	public Board read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".read");

	}

	@Override
	public void update(Board vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".update", vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".delete", bno);
	}

	@Override
	public List<Board> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".listAll");
	}

}
