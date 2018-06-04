package com.tomcat.cn.run;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				                                       new String[] { "classpath:spring/spring-web.xml" });
		context.start();

		// 控制程序退出
		Scanner scanner = new Scanner(System.in);
		System.out.println("启动成功,输入exit停止程序");
		try {
			while (true) {
				if (scanner.hasNext()) {
					String x = scanner.nextLine();
					if ("exit".equals(x))
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
			scanner.close();
		}

	}

}
