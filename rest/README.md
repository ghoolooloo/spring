rest项目虽然打包成war，但仍能使用mvn spring-boot:run在内嵌Web容器中启动应用。也可以使用 java -jar rest.war 方式来在内嵌Web容器中启动应用。

如果要在外部Web容器中启动应用，则先使用 mvn clean package 打包。这时，会在 target 目录下生成两个war文件：rest-0.1.0.war（多了一个WEB-INF/lib-provided目录，里面包含内嵌Tomcat的jar文件）和rest-0.1.0.war.original。两个war都可以直接部署到外部Web容器中（推荐用rest-0.1.0.war.original）。

如果在 Servlet 3.0 之前的Web容器中部署 Spring Boot 打包的 war 文件，则还需要在项目中添加 web.xml（参见官方文档）。

# .hello

## /greeting?user=Jo

响应一个 JSON 文本（例如：{"id":1,"content":"Hello, Jo!"}）的 RESTful Web 服务。

# .consumingrest

这个例子演示了通过 RestTemplate 请求 http://gturnquist-quoters.cfapps.io/api/random，获取下列JSON数据：

	{
	   type: "success",
	   value: {
	      id: 10,
	      quote: "Really loving Spring Boot, makes stand alone Spring apps easy."
	   }
	}

RestTemplate 将JSON 转换成 Quote 对象，并输出到日志。

这个例子使用了 CommandLineRunner，日志将在启动应用时输出：

> 2015-07-03 11:30:07.794  INFO 4060 --- [lication.main()] j.s.rest.consumingrest.ConsumingRest     : Quote(type=success, value=Value(id=5, quote=Spring Boot solves this problem. It gets rid of XML and wires up common components for me, so I don't have to spend hours scratching my head just to figure out how it's all pie ced together.))

# .jpa

演示了通过 hypermedia-based RESTful 前端来访问 JPA 数据。