package com.palm.dbpool.oracle.bean;

/**
 * 
 * @author weixiang.qin
 * 
 */
public class UserTabComments {
	private String tableName;
	private String tableType;
	private String comments;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}