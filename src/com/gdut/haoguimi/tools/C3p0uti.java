package com.gdut.haoguimi.tools;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0uti {
	private static ComboPooledDataSource comboPooledDataSource;
	static {
		comboPooledDataSource = new ComboPooledDataSource();
	}
	

	// 取得链接
	public static Connection getMySqlConnection() throws SQLException {
		return comboPooledDataSource.getConnection();
	}
}
