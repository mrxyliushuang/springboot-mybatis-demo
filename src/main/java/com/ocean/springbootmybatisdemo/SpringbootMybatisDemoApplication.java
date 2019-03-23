package com.ocean.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.*;

@SpringBootApplication
@MapperScan("com.ocean.dao")
@ComponentScan(basePackages = {"com.ocean.*"})
public class SpringbootMybatisDemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		SpringApplication.run(SpringbootMybatisDemoApplication.class, args);

		System.out.println("--------------aaaa------------------");

//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://134.176.110.182:8907/yqdb");
//        dataSource.setUsername("yqq");
//        dataSource.setPassword("DX@yqq0318");

		String URL="jdbc:mysql://134.176.110.182:8907/yqdb?useUnicode=true&amp;characterEncoding=utf-8";
		String USER="yqq";
		String PASSWORD="DX@yqq0318";
		//1.加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//2.获得数据库链接

		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from yqdb.rule_publish");
		//4.处理数据库的返回结果(使用ResultSet类)
		while (rs.next()) {
			System.out.println("-----in");
			System.out.println("---" +rs.getString("rule_publish_id")+rs.getString("rule_title"));

		}

		//关闭资源
		rs.close();
		st.close();
		conn.close();

	}

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return (container -> {
			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

			container.addErrorPages(error401Page, error404Page, error500Page);
		});
	}
}


