package org.springframework.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

class User {
	private Integer id;
	private String userName;
	// 下面就是setter、getter、toString和构造器，此处省略
	public User(Integer id, String userName) {
		this.id = id;
		this.userName = userName;
	}
}

@Configuration
@Component
class JavaConfig {
	@Bean
	public User user(){
		return new User(1, "psj");
	}
}

public class MyTest1 {
	public static void main(String[] args) {
		System.out.println("--------into start");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());  // 可以成功输出就OK了！！！
	}
}
/**
 build.gradle配置
 //引用本地模块源码1
 //    implementation project(path: ':spring-context')
 //引用本地模块源码2
 //    optional(project(":spring-context"))
 //引用本地模块源码3
 api(project(":spring-context"))
 //引用本地模块源码4(下面引用本地模块方式是否过时？？？)
 //    compile(project(":spring-context"))

 //引用远程仓库jar
 //    optional("org.aspectj:aspectjweaver")
 */