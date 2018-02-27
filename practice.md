**最佳实践**
1.
zuul网关实践：
way1： zuul地址/service_id/...
如访问url:
http://localhost:8080/consumer/test

way2: zuul地址/zuul中配置的微服务别名/..., 这种方式类似Nginx url配置
如zuul中配置
zuul.routes.abc.path=/user-abc/**
zuul.routes.abc.serviceId=consumer
访问url:
http://localhost:8080/user-abc/test