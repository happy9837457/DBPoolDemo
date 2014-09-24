package com.palm.dbpool.oracle.dao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.dbpool.oracle.bean.UserTabComments;
import com.palm.dbpool.util.SpringHelper;

public class UserTabCommentsDaoTest {
	private UserTabCommentsDao userTabCommentsDao;

	@Before
	public void setUp() throws Exception {
		userTabCommentsDao = SpringHelper.getBean("userTabCommentsDao");
	}

	@Test
	public void testQueryAllUserTabComments() {
		List<UserTabComments> userTabComments = userTabCommentsDao
				.queryAllUserTabComments();
		System.out.println("size:" + userTabComments.size());
	}

	@After
	public void tearDown() throws Exception {
		userTabCommentsDao = null;
	}

}
