FROM java:8

RUN git clone git://github.com/training-committee/onboarding.git

WORKDIR /onboarding

RUN chmod +x gradlew && \
  ./gradlew npmInstall grunt_build assemble

EXPOSE 9090

ENTRYPOINT ["java","-Djava.security.egd=file:/dev./urandom", "-jar", "build/libs/gs-spring-boot-0.1.0.jar"]
