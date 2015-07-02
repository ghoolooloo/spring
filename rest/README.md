rest项目虽然打包成war，但仍能使用mvn spring-boot:run在内嵌Web容器中启动应用。也可以使用 java -jar rest.war 方式来在内嵌Web容器中启动应用。

如果要在外部Web容器中启动应用，则先使用 mvn clean package 打包。这时，会在 target 目录下生成两个war文件：rest-0.1.0.war（多了一个WEB-INF/lib-provided目录，里面包含内嵌Tomcat的jar文件）和rest-0.1.0.war.original。两个war都可以直接部署到外部Web容器中（推荐用rest-0.1.0.war.original）。

如果在 Servlet 3.0 之前的Web容器中部署 Spring Boot 打包的 war 文件，则还需要在项目中添加 web.xml（参见官方文档）。

# .hello

学会如何通过 Spring 创建一个 RESTful Web 服务。