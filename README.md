# TemplateCode - Java - Spring - GraphQL
Author: Leonardo Simões

Template Code for a GraphQL in the Java language with Spring Framework and Gradle.
The APP has two resources: MainResource and AssociatedResource.


## Development steps
The project development steps were:

1. Create project (in IntelliJ) with:
- Java language (17);
- Spring Framework (6.2.3);
- Dependencies: Web, GraphQL, DevTools, Lombok, JPA and H2.

![Image-01-IntelliJ](images/Image-01-IntelliJ.png)

2. Change the start of the Run screen with custom text (or image):
- format the desired text using `https://springhow.com/spring-boot-banner-generator/` and download `banner.txt`;

![Image-02-BannerGenerator](images/Image-02-BannerGenerator.png)

- place the `banner.txt` file in `src/main/resources` (or another path);
- (optional) add `${spring.application.name}` and `Spring Boot ${spring-boot.formatted-version}` in `banner.txt`;
- (optional) configure the `banner.txt` file path in `application.properties`:
  * `spring.banner.location=classpath:/banner.txt`.


## References
Spring - Guides - Building a GraphQL service:
https://spring.io/guides/gs/graphql-server

Spring - Docs - Spring for GraphQL:
https://docs.spring.io/spring-graphql/reference/index.html

Baeldung - Introduction to GraphQL:
https://www.baeldung.com/graphql

Baeldung - Getting Started with GraphQL and Spring Boot:
https://www.baeldung.com/spring-graphql

GraphQL Java - Tutorial - Getting started with Spring for GraphQL:
https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/