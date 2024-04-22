# TemplateCode - Java - Spring - GraphQL
Autor: Leonardo Simões

Modelo de código para uma GraphQL na linguagem Java com Spring Framework e Gradle.
A aplicação possui dois recursos: MainResource e AssociatedResource.


## Etapas do desenvolvimento
As etapas de desenvolvimento do projeto foram:

1. Criar projeto (no IntelliJ) com:
- Linguagem Java (17);
- Spring Framework (6.2.3);
- Dependências: Web, GraphQL, DevTools, Lombok, JPA e H2.

![Image-01-IntelliJ](images/Image-01-IntelliJ.png)

2. Alterar início da tela de Run com texto (ou imagem) personalizado:
- formatar o texto desejado usando `https://springhow.com/spring-boot-banner-generator/` e baixar `banner.txt`;

![Image-02-BannerGenerator](images/Image-02-BannerGenerator.png)

- colocar o arquivo `banner.txt` em `src/main/resources` (ou outro caminho);
- (opcional) adicionar `${spring.application.name}` e `Spring Boot ${spring-boot.formatted-version}` em `banner.txt`;
- (opcional) configurar o caminho do arquivo `banner.txt` em `application.properties`:
    * `spring.banner.location=classpath:/banner.txt`.

3. Configurar o banco de dados H2:
- Em `build.gradle` configurar de acordo com o tipo de uso desejado:
  * `implementation 'com.h2database:h2'`;
  * `runtimeOnly 'com.h2database:h2'`;
  * `testImplementation 'com.h2database:h2'`;
- Em `application.properties`:

```properties
# ================================================================
#                   APPLICATION
# ================================================================
spring.application.name=TemplateCode-Java-Spring-GraphQL
# spring.banner.location=classpath:/banner.txt
# ================================================================
#                   DATASOURCE - H2 DATABASE
# ================================================================
spring.datasource.url=jdbc:h2:mem:proddb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=leo
spring.datasource.password=senha
spring.h2.console.enabled=true
spring.h2.console.path=/h2
```

![Image-03-Terminal-Run](images/Image-03-Terminal-Run.png)

- testar acesso ao console do H2 em `http://localhost:8080/h2/`:

![Image-04-B-ConsoleH2](images/Image-04-B-ConsoleH2.png)

Obs.:
- Por padrão, o usename seria "sa" e a senha "", e o console do h2 estaria desativado.


## Referências
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