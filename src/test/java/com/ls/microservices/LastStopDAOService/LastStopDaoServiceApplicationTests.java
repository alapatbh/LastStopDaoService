package com.ls.microservices.LastStopDAOService;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LastStopDaoServiceApplicationTests {
	@Autowired
	DataSource dataSource;
	
	@Test
	public void test1() throws SQLException {
		Logger log= LoggerFactory.logger(LastStopDaoServiceApplicationTests.class);
	    
	    }
	}
