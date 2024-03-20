FROM openjdk:19-jdk

WORKDIR /usrapp/bin

ENV PORT 8083

COPY /target/classes /usrapp/bin/classes
COPY /target/dependency /usrapp/bin/dependency

CMD ["java", "-cp", "./classes:./dependency/*", "com.pesto.ecommerce"]