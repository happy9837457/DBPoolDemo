package com.palm.dbpool.mysql.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.dbpool.mysql.bean.Tables;
import com.palm.dbpool.mysql.dao.TablesDao;

/**
 * TablesDao接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Repository("tablesDao")
public class TablesDaoImpl implements TablesDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Tables> queryAllTables() {
		return sqlSessionTemplate.selectList("Tables.queryAllTables");
	}

}
