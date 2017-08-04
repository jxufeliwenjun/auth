package com.hzit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SqlSessionHelper {
	private static SqlSession session;
	private  static SqlSessionFactory factory;
	static org.apache.log4j.Logger log= org.apache.log4j.Logger.getLogger("SqlSessionHelper");
	static{
		Reader r;
		try {
			r = Resources.getResourceAsReader("mybatis");
			log.debug("读取配置文件成功");
			 factory=new SqlSessionFactoryBuilder().build(r);
			log.debug("Sqlsession工厂创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static SqlSession getSqlSession(){
		if (session==null)
			session=factory.openSession();
			log.debug("获取了session对象");
			return session;
	}

}
