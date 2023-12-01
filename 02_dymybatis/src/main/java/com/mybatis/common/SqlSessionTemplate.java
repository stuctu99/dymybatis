package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	public static SqlSession getSession() {
		SqlSession session=null;
		String fileName = "dymybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(fileName);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			session = ssf.openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
	public static SqlSession getSessionWeb() {
		SqlSession session=null;
		String fileName =  "dymybatis-config.xml";
		try {
			new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(fileName),"web")
										  .openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
}
