### client2介绍
#### 简介
> 官方项目地址:https://github.com/apereo/java-cas-client
> client2是和cas-server对接的client配置,核心是pom.xml中引入cas-client-core.它通过web.xml中定义一系列filter,listener来
> 触发对应的cas-client-core中方法,实现认证,授权,登录等操作;同时cas现在由apereo组织维护,server端版本更新变化比较大;但是
> client端方面变化比较小,注意它的包名还是jasig;

pom.xml中引入cas-client-core
```
<dependency>
    <groupId>org.jasig.cas.client</groupId>
    <artifactId>cas-client-core</artifactId>
    <version>${java.cas.client.version}</version>
</dependency>
```
> 当然还可以引入其他代理,集成tomcat,jboss等servlet容器依赖,以满足自己不同的业务需求;

#### 配置
- 
