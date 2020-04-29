package org.zerock.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lombok.Getter;
import lombok.extern.log4j.Log4j;


@Log4j
@Getter
public class AIASessionFactory {
	
	private static AIASessionFactory instance = new AIASessionFactory();
	
	public static AIASessionFactory getInstance() {
		
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;

	private AIASessionFactory() {
		try {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e) {
			log.error(e);
			e.printStackTrace();
		}
	}
	
}
