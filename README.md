# Hello World Spring Boot Application

## how to start this application with spring initializr

1. navigate to start.spring.io
2. choose Maven project
3. Choose Java language
4. use the latest version of Spring Boot
5. fill in Project metadata
6. choose Jar packaging
7. choose Java 11
8. add Spring Web, Thymeleaf dependencies
9. click generate
10. unzip the downloaded file
11. import project to your favourite IDE as a Maven project
12. choose Java 11 as your language
13. under src/main/resources create a file index.html 
14. add the same content as in this project

## how to start this application with Intellij IDE

1. verify that Spring boot plugin is enabled. if not, go to https://plugins.jetbrains.com/plugin/10229-spring-assistant and install it in your IDE
2. go to Project and start new project.
3. choose Spring assistant
4. select Java 11 as SDK, the default for spring initializr and hit next
5. fill in project properties, same as above and hit next
6. in the dependency section, from web select Spring Web, and from Template Engines select Thymeleaf
7. create index.html under src/main/resources as mentioned above.
8. you're ready to go

## how to run the application from the command line
1. run <code>mvn clean package</code> command
2. Run <code>java -jar target/learning-spring-2.4.1.jar</code> Whereas learning-spring is the name of your project, and 2.4.1 is the version of the spring boot. 
3. go to your web browser to localhost:8080

 
