package org.zerock.dao.test;

import org.junit.Test;
import org.zerock.dao.TimeDAO;

import lombok.extern.log4j.Log4j;

@Log4j
public class TimeDAOTests {

	private TimeDAO timeDAO = new TimeDAO();
	
	
	@Test
	public void testTime() {
		String now = timeDAO.getTime();
		log.info(now);
	}
	
	@Test
	public void testTime2() {
		String now = timeDAO.getTime2();
		log.info(now);
	}
	
}
