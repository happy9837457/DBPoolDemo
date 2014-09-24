package com.palm.dbpool.oracle.dao;

import java.util.List;

import com.palm.dbpool.oracle.bean.UserTabComments;

/**
 * UserTabCommentsDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserTabCommentsDao {
	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	public List<UserTabComments> queryAllUserTabComments();
}
