1.spring-framework-6.0.7能正常构建
2.spring-framework5.2.23与spring-framework-5.3.26不能正常构建
	错误见test文件夹构建报告，可以优先尝试使用jdk11是否可以jar包，否则再使用jdk8试试???
3.创建spring子工程验证代码及配置build.gradle与Main.java
4.spring源码构建时遇到的问题及笔记sprinbuild.txt文件
---------------------------------spring构建方式（尝试？？？）
https://blog.51cto.com/u_16099192/7205677
1.settings.gradle配置maven仓库

2.gradle.properties
org.gradle.java.home=...../Contents/Home //指定jdk目录

3.build.gradle
配置maven仓库
---------------------------------Idea安装Diagrams插件???
https://wenku.csdn.net/answer/08ae6ef0aab94d52a98636a9b3423144
Plugins->搜索“PlantUML Integration”