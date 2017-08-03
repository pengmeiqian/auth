package com.jc02.util;

import java.io.IOException;
import java.io.Reader;
import java.util.logging.Logger;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionHelp {
	private static SqlSession session;
	private static SqlSessionFactory factory;
	private static Logger log = Logger.getLogger("SqlSessionHelp.class");
	static{
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			System.out.println("读取配置文件成功");
			factory=new SqlSessionFactoryBuilder().build(reader);
			System.out.println("SqlSession工厂创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static SqlSession SqlSessionHelp() {
		session=factory.openSession();
		System.out.println("获取了Session对象");
		return session;
	}

}
