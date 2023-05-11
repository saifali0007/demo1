FROM java:17
EXPOSE 8080
ADD target/demo1.jar demo1.jar
ENTRYPOINT ["java","jar","demo1.jar"]