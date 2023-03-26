package org.springframework;


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

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());  // 可以成功输出就OK了！！！
}
}