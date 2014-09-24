package com.palm.dbpool.mysql.dao;

import java.util.List;

import com.palm.dbpool.mysql.bean.Tables;

/**
 * TablesDao接口
 * 
 * @author weixiang.qin
 * 
 */
public interface TablesDao {
	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	public List<Tables> queryAllTables();
}
