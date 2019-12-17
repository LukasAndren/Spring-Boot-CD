FROM java:8

RUN mkdir /root/gitrepo/

RUN cd root/gitrepo/

RUN git clone https://github.com/LukasAndren/Spring-Boot-CD.git

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/root/gitrepo/demo/spring-boot-docker.jar"]