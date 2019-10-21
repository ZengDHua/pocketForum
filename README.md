## 口袋论坛

## 资料
[Spring 文档](https://spring.io/guides)

[Spring Web 文档](https://spring.io/guides/gs/serving-web-content/)

[es社区](https://elasticsearch.cn/explore)

[GitHub OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring database](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

[Lombok](https://projectlombok.org/setup/maven)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-theach)

[Spring interceptor](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)


## 工具
[Visual Paradigm](https://www.visual-paradigm.com/cn/)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

## 脚本
```sql
create table USER
(
	ID INTEGER auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);
```
```bash
mvn flyway:clean
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```