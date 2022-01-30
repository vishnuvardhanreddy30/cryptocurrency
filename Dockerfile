FROM openjdk:1.8
COPY /target/cryptocurrencylookup*.jar /home/app/cryptocurrencylookup/app.jar
EXPOSE 8086
ENTRYPOINT java -jar /home/app/cryptocurrencylookup/app.jar