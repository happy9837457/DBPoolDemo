package com.palm.dbpool.mysql.dao;

import java.io.InputStreamReader;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.logicalcobwebs.proxool.configuration.JAXPConfigurator;

import com.palm.dbpool.mysql.bean.Tables;
import com.palm.dbpool.util.Resources;
import com.palm.dbpool.util.SpringHelper;

public class TablesDaoTest {
	private TablesDao tablesDao;

	// 使用proxool.xml配置必须先加载proxool.xml
	@BeforeClass
	public static void beforeClass() throws Exception {
		JAXPConfigurator.configure(
				new InputStreamReader(Resources
						.getResourceAsStream("proxool.xml"), "utf-8"), false);
	}

	@Before
	public void setUp() throws Exception {
		tablesDao = SpringHelper.getBean("tablesDao");
	}

	@Test
	public void testQueryAllTables() {
		List<Tables> tables = tablesDao.queryAllTables();
		System.out.println("size:" + tables.size());
	}

	@After
	public void tearDown() throws Exception {
	}

}
