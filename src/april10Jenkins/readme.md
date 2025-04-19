## Soap ??


## Deployment 
## release 

## CI/CD

Continuous Integration / Continuous Deployment/Delivery

JAR File : Executable file --> Java archive
.jar file is executable file that deploy on any server

Commit --> Build --> .jar 
Builds ---> compile your code and check any issue and fix it and make .jar file/ executable file

## Maven is build tool help to create .jar file
Mvn install help to create .jar file
mvn clean clear the previous build 
use combined mvn install abd mnv clean, it clears previous build and create new build 
After build it and deploy in different environment

Junit --> unit testing framework
Mockito?
Hamcrest?

SONAR ? check code quality tool

## Jenkins ? is platform to automate your code like make build , test it, make .jar file . We can use different software on Jenkins
   platform, but we have to tell all the things by manually to jenkins. 
-- Jenkins is not a tool only it is framework as well means we can change plugging according to our need
   for example if we don't want jenkins is totally automated, like we  want to do test by our-self not by jenkins, so we
   can change it as its framework.
-- Jenkins work on Master-Slave architecture, master divide the work among slaves, if slave is not available, Master(Jenkins)
   will do itself.
-- Label - jenkins mark label, means which slave will do which work.
-- Jenkins is written in java .
-- Artifactory-- for archiving purpose mean it stores final code that ready for future or to deliver to someone
   as git-hub store raw code or source code, on which we are currently working
   
Maven / Gradle
Jenkins / Github actions