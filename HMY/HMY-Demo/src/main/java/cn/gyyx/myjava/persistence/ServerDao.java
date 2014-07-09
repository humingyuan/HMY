package cn.gyyx.myjava.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.gyyx.myjava.entity.ServerInfo;

public class ServerDao extends BaseDao {

	private SqlSession session = null;
	
	public List<ServerInfo> queryListByGameId(int gameId)
	{
		String temp = "ServerInfo.queryListByGameId";
		
		List<ServerInfo> list = null;
		
		try {
			
			session = sessionFactory.openSession();
			list = session.selectList(temp, gameId);
			session.close();
					
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
		}
		
		return list;
	}
	
}
