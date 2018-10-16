package com.itcast.Test;


import com.itcast.Dao.AccountDao;
import com.itcast.Service.AccountService;

import com.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.InputStream;
import java.util.List;


public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext
                ("classpath:ApplicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream rs = Resources.getResourceAsStream("sqlmapconfig.xml");
        //创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(rs);
        //创建sqlSession
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //执行查询

        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        rs.close();
    }
    @Test
    public void run3(){
        int a =10;
        int b=20 ;
        int c =a+++b+++a;
        int d = a+++b;
   //      int d= ++a+b;
        System.out.println("a："+a);
        System.out.println("b："+b);
      //  System.out.println("c："+c);
        System.out.println("d:"+d);
    }
}
