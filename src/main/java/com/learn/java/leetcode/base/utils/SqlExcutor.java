package com.learn.java.leetcode.base.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.learn.java.leetcode.base.Utilitys;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;
import java.util.Map;

public class SqlExcutor {
	private static final String connectDriver = InitializationConfig.readProperties().getProperty("connection.driverClass");
	private static final String connectUrl = InitializationConfig.readProperties().getProperty("connection.url");
	private static final String connectUserName = InitializationConfig.readProperties().getProperty("connection.username");
	private static final String connectPassword = InitializationConfig.readProperties().getProperty("connection.password");
	private static final String exec = InitializationConfig.readProperties().getProperty("sql.exec");


	public static void runSql(Class clazz,List<String> funcList,List<String> sqlList) {
		Connection conn = null;
		BufferedReader reader = null;
		try {


			//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			Class.forName(connectDriver);

			// 建立连接
			//conn = DriverManager.getConnection("jdbc:derby:derbydb;create=true");

			conn = DriverManager.getConnection(connectUrl, connectUserName, connectPassword);

			String packageName = clazz.getPackage().getName();

			if(funcList!=null&&funcList.size()>0){
				for(int i =0;i<funcList.size();i++){
					String func = funcList.get(i);
					String sqlName = sqlList.get(i);

					if("run".equals(func)){
						runSql(packageName,conn,sqlName);
					}else if("select".equals(func)){
						selectSql(packageName,conn,sqlName);
					}
				}
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void runSql(String packageName,Connection conn,String sqlName){
		BufferedReader reader = null;
		try{

			String path = "/" + packageName.replaceAll("\\.", "/") + "/"+sqlName;

			ScriptRunner runner = new ScriptRunner(conn);
			//runner.setErrorLogWriter(null);
			runner.setLogWriter(null);

			runner.setStopOnError(true);
			runner.setSendFullScript(false);
			runner.setDelimiter(";");
			runner.setFullLineDelimiter(false);


			InputStream is = Utilitys.class.getResourceAsStream(path);
			reader = new BufferedReader(new InputStreamReader(is));

			// 执行SQL脚本
			runner.runScript(reader);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void selectSql(String packageName,Connection conn,String sqlName){
		String mainPath = "/" + packageName.replaceAll("\\.", "/") + "/"+sqlName;
		String mainSql = readSqlFile(mainPath);
		//执行查询
		List<Map<String, Object>> queryResult = null;
		try {
			queryResult = selectSqlMap(conn,mainSql);
			if (queryResult != null && queryResult.size() > 0) {
				String str = JSONArray.toJSONString(queryResult, SerializerFeature.WriteMapNullValue);
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static String readSqlFile(String path) {
		StringBuilder lastJson = new StringBuilder();
		BufferedReader reader = null;
		try {
			InputStream is = Utilitys.class.getResourceAsStream(path);
			reader = new BufferedReader(new InputStreamReader(is));
			String tempString = null;


			while ((tempString = reader.readLine()) != null) {
				if(!tempString.startsWith("#")){
					lastJson.append(tempString.replaceAll("\r"," ").replaceAll("\n"," "));
				}
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return lastJson.toString();
	}


	private static List<Map<String, Object>> selectSqlMap(Connection conn, String sql)throws SQLException{
		Statement st = null;
		ResultSet rs = null;
		try {
			// 创建语句执行者
			st = conn.createStatement();

			//直接查询
			rs = st.executeQuery(sql);

			ColumnMapRowMapper rowMapper = new ColumnMapRowMapper();
			ResultSetExtractor<List<Map<String, Object>>> resultSetExtractor = new RowMapperResultSetExtractor<>(rowMapper);
			List<Map<String, Object>> queryResult = resultSetExtractor.extractData(rs);
			return queryResult;

		} catch (SQLException e) {
			throw e;
		} finally {
			//关闭
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
