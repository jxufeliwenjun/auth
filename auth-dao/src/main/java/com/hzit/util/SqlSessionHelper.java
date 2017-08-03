package com.hzit.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionHelper {
	private static SqlSession session;
	private  static SqlSessionFactory factory;
	static{
		Reader r;
		try {
			r = Resources.getResourceAsReader("mybatis-config.xml");
			System.out.println("读取配置文件成功");
			 factory=new SqlSessionFactoryBuilder().build(r);
			System.out.println("Sqlsession工厂创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static SqlSession getSqlSession(){	
			session=factory.openSession();
			System.out.println("获取了session对象");
			return session;
	}

}
