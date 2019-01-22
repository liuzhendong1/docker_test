FROM busybox
 
ADD test2-1.0-SNAPSHOT.jar app.jar

RUN docker push app.jar
 
ENV JAVA_HOME /usr/java/jdk1.8.0_121
ENV PATH $PATH:$JAVA_HOME/bin
 
EXPOSE 5000
 
CMD ["java","-jar","app.jar"]

