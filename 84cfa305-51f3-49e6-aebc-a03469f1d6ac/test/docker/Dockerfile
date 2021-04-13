FROM docker-apollo.wolterskluwer.io/alfresco-content-repository-core:1.0.0

ARG TOMCAT_DIR=/usr/local/tomcat
ARG AMPS_DIR=$TOMCAT_DIR/custom_amps

RUN mkdir -p $AMPS_DIR

COPY target/amps $AMPS_DIR

RUN java -jar $TOMCAT_DIR/alfresco-mmt/alfresco-mmt*.jar install \
              $AMPS_DIR $TOMCAT_DIR/webapps/alfresco -directory -nobackup -force
