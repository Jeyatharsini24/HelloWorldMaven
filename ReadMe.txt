Create with maven-archetype-quickstart from catalogs
Skip test and clean and create package : Goals= clean package -Dmaven.test.skip=true

Maven compiler plugin: is used to build project using different JDK version



Add a jar file to local maven repository:

In cmd, go into jar file's directory which you want to add to local Maven
Repository and enter the command similar to the following command:
mvn install:install-file -Dfile=ojdbc14.jar -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.2.0.4.0 -Dpackaging=jar
Window -> show view -> maven -> maven repositories -> local repository -> rebuild index
(To add the jar file for indexing)