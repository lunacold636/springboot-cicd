FROM crpi-q67ejfvhi9pf4o8n.cn-hangzhou.personal.cr.aliyuncs.com/my_registry1/openjdk:17-jdk-alpine
USER root

LABEL maintainer="yanjia.lu <lunacold636@gmail.com>"

LABEL version="1.0.0"

ENV DOCKER_DIR /luyanjia/jar_8085

ENV LOG_DIR /luyanjia/logs

ENV JVM_ARGS -server -Xms512m -Xmx512m \
-XX:+HeapDumpOnOutOfMemoryError \
-XX:HeapDumpPath=${LOG_DIR}/dump/dump-yyy.log \
-XX:ErrorFile=${LOG_DIR}/jvm/jvm-crash.log

ENV LANG en_US.utf8
ENV LANGUAGE en_US.utf8
ENV LC_ALL en_US.utf8

ENV PROJECT_NAME myAppProject
ENV SERVICE_NAME myApp
#ENV VULHUNTER_AGENT_TOKEN 266383317cf7430cae6109bf50abf86c

ENV JAR_NAME ${SERVICE_NAME}.jar

ENV SERVER_PORT 8085

ENV CONTEXT_PATH /

VOLUME ${DOCKER_DIR}


COPY ./target/*.jar  /root/${JAR_NAME}

# copy arthas
COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

EXPOSE 8085

ENTRYPOINT java \

${JVM_ARGS} \
-Dserver.port=${SERVER_PORT} \
-Dserver.servlet.contextPath=${CONTEXT_PATH} \
-jar /root/${JAR_NAME}

RUN echo Asia/Shanghai > /etc/timezone