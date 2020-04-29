package org.zerock.dao;

import org.apache.ibatis.session.SqlSession;

public class TimeDAO {

	public String getTime() {
		
		SqlSession session = AIASessionFactory.getInstance().getSqlSessionFactory().openSession();
		
		String result = session.selectOne("org.zerock.dao.mapper.TimeMapper.getTime");
		
		return result;
	}
	
	public String getTime2() {
		
		SqlSession session = AIASessionFactory.getInstance().getSqlSessionFactory().openSession();
		
		String result = session.selectOne("org.zerock.dao.mapper.TimeMapper.getTime2");
		
		return result;
	}
}
