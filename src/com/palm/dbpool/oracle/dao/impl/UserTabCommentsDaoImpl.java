package com.palm.dbpool.oracle.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.dbpool.oracle.bean.UserTabComments;
import com.palm.dbpool.oracle.dao.UserTabCommentsDao;

/**
 * UserTabCommentsDao接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Repository("userTabCommentsDao")
public class UserTabCommentsDaoImpl implements UserTabCommentsDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<UserTabComments> queryAllUserTabComments() {
		return sqlSessionTemplate.selectList("UserTabComments.queryAllUserTabComments");
	}

}
