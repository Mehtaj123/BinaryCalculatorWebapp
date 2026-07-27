FROM eclipse-temurin:11-jre
VOLUME /tmp
COPY target/*.war app.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.war"]
