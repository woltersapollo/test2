# Alfresco 6.1

This is an Alfresco Digital Business Platform project.

# # Build prerequisites:
1. To get an access to the private Docker images from `docker-apollo.wolterskluwer.io` registry use [docker login](https://bitbucket.wolterskluwer.io/plugins/servlet/edit/projects/APOLLO/repos/apollo-alfresco6-quickstart/README.md?at=refs%2Fheads%2Falfresco-dbp-6.1&path=README.md) command with your credentials.
2. Add shared drive in Docker where the project located. `Docker -> Options -> Shared Drives`
3. Update Maven [settings.xml](https://maven.apache.org/settings.html) file to include credentials to access Alfresco Private Repository.
4. Make sure that at least 8GB of RAM is allocated to the Docker agent.

# # Build commands:

Run with `./run.sh build_start` or `./run.bat build_start` and verify that it

 * Runs Alfresco Content Service (ACS)
 * Runs Alfresco Search Service (ASS)
 * Runs PostgreSQL database
 
All the services of the project are now run as docker containers. The run script offers the next tasks:

 * `build_start`. Build the whole project, recreate the ACS docker image, start the dockerised environment composed by ACS, ASS and PostgreSQL 
and tail the logs of all the containers.
 * `start`. Start the dockerised environment without building the project and tail the logs of all the containers.
 * `stop`. Stop the dockerised environment.
 * `purge`. Stop the dockerised container and delete all the persistent data (docker volumes).
 * `tail`. Tail the logs of all the containers.
 * `build_test`. Build the whole project, recreate the ACS docker image, start the dockerised environment, execute the integration tests and stop 
 the environment.
 * `test`. Execute the integration tests (the environment must be already started).

Development guide at [confluence page.](https://confluence.wolterskluwer.io/display/AP/Java+Programming+Guide)
