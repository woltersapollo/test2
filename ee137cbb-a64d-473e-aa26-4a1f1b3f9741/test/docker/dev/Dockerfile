FROM docker-apollo.wolterskluwer.io/alfresco-content-repository-test:latest

ARG TOMCAT_DIR=/usr/local/tomcat

COPY assets/dev-log4j.properties $TOMCAT_DIR/shared/classes/alfresco/extension
COPY assets/disable-webscript-caching-context.xml $TOMCAT_DIR/shared/classes/alfresco/extension

COPY jrebel/*.* $TOMCAT_DIR/

RUN java -jar $TOMCAT_DIR/jrebel.jar -set-remote-password alfresco
