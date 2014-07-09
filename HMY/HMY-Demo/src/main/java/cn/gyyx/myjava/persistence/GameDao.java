package cn.gyyx.myjava.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.gyyx.myjava.entity.GameInfo;

public class GameDao extends BaseDao {

	private SqlSession session = null;
	
	public List<GameInfo> queryList()
	{
		String temp = "GameInfo.queryList";
		
		List<GameInfo> list = null;
		
		try {
			
			session = sessionFactory.openSession();
			list = session.selectList(temp, null);
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
		}
		
		return list;
	}
	
}
