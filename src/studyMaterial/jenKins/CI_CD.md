## https://youtu.be/N-Iv4KIOvKY?si=pcZkhaA1P2BKAvlD  best explanation for CI/CD

##  CI - Continuous Integration : A process where team members integrate their work continuously in a shared  repository
-- CD Continuous Delivery After the CI process, deploying on a prod like env and running automation tests to ensure
    the build is ready to release. Ensure build is always in deployeable state
-- CD Continuous Deployment : Automated deployement to prod, every change that passes through automation tests is 
    deployed to production
## CI/CD stands for Continuous Integration and Continuous Delivery/Deployment. It's a set of practices and tools that
   automate the process of building, testing, and deploying software, enabling faster and more reliable releases.

## Key Components of CI/CD:

1. Continuous Integration (CI)
-- Developers frequently merge code changes into a shared repository (e.g., GitHub, GitLab).
-- Each merge triggers an automated build and test process to detect errors early.
-- Tools: Jenkins, GitHub Actions, GitLab CI, CircleCI, Travis CI.

2. Continuous Delivery (CD)
-- Ensures that code changes are always in a deployable state (Staging state come before deploy state) after passing CI.
-- Manual approval may be required before deployment to production.
-- Tools: Spinnaker, Argo CD, AWS CodeDeploy.

3. Continuous Deployment (CD)
-- An extension of Continuous Delivery where every change that passes CI is automatically deployed to production.
-- No human intervention is needed (unless a failure occurs).

## CI/CD Pipeline Stages:

1. Code Commit → Developers push changes to a version control system (e.g., Git).
2. Build →       Compile code, resolve dependencies, and create artifacts (.jar file ready to transfer anywhere).
3. Test →        Run automated tests (unit, integration, security, performance).
4. Deploy to Staging → Release to a test environment for validation.
5. Deploy to Production → Roll out to live users (manual or automatic).
6. Monitor & Feedback → Track performance and logs for improvements.

## Benefits of CI/CD:

✔ Faster Releases – Automate repetitive tasks to speed up delivery.
✔ Early Bug Detection – Catch issues before they reach production.
✔ Consistent Deployments – Reduce human errors in manual processes.
✔ Improved Collaboration – Developers and operations work seamlessly.
✔ Rollback Capability – Quickly revert if a deployment fails.

## Popular CI/CD Tools:

-- Jenkins (Open-source, highly customizable)
-- GitHub Actions / GitLab CI (Native integration with Git repos)
-- CircleCI (Cloud-based, supports Docker)
-- Azure DevOps (Microsoft’s end-to-end solution)
-- AWS CodePipeline (Integrated with AWS services)

Example CI/CD Workflow:

Developer commits code → CI server runs tests → Builds Docker image →
Deploys to Kubernetes → Runs smoke tests → Notifies team if successful/fails.

## By adopting CI/CD, teams can achieve faster, more reliable, and automated software delivery, improving overall 
   efficiency and quality.

----------------------------------------------------------------------------------------------------------------------

## Creating a .jar (Java Archive) file packages your Java classes, resources, and metadata into a single file for 
   distribution or execution. Here’s a step-by-step guide:

Method 1: Using javac & jar (Command Line)

1. Write a Java Program

Create a simple Java file (e.g., HelloWorld.java):
public class HelloWorld {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
2. Compile to .class
Run in terminal:
javac HelloWorld.java
This generates HelloWorld.class.

3. Create a .jar File

Package the .class file into a .jar:

jar cvf HelloWorld.jar HelloWorld.class
c: Create a new JAR.
v: Verbose output.
f: Specify filename.

4. (Optional) Make it Executable

Add a Manifest.txt file (with Main-Class defined):
Main-Class: HelloWorld
Then build the JAR:
jar cvfm HelloWorld.jar Manifest.txt HelloWorld.class

5. Run the JAR

java -jar HelloWorld.jar
Output: Hello, World!

## Method 2: Using Maven

If using Maven (for projects with pom.xml):
Navigate to your project directory.
Run:
mvn package
The .jar will be in target/ (e.g., target/my-app-1.0.jar).

## Method 3: Using Gradle

For Gradle projects:
Run:

gradle build
The .jar will be in build/libs/.

## Key Notes:

Fat/Uber JAR: To include dependencies (e.g., using Maven Shade Plugin or Gradle Shadow Plugin).
IDE Support:
Eclipse: Right-click project → Export → JAR File.
IntelliJ: Build → Build Artifacts → JAR.

## Example: Creating a Fat JAR with Maven

Add this to pom.xml:

xml
<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-shade-plugin</artifactId>
<version>3.4.1</version>
<executions>
<execution>
<phase>package</phase>
<goals>
<goal>shade</goal>
</goals>
</execution>
</executions>
</plugin>
</plugins>
</build>
Then run mvn package.

------------------------------------------------------------------------------------------------------------------------
## What is an Artifact in CI/CD?
   An artifact is a file or set of files generated during a software build process. These can include:

-- Compiled binaries (.jar, .exe, .dll)
-- Packages (.zip, .tar, .deb, .rpm)
-- Docker images
-- Reports (test results, logs, coverage)
-- Documentation (HTML, PDFs)
-- Artifacts are typically stored in a repository (like Nexus, Artifactory, or S3) for deployment or debugging.

## How to Handle Artifacts in Jenkins

1. Generating Artifacts

In your build process (e.g., Maven, Gradle, Make), artifacts are created:
Maven: mvn package → Generates .jar/.war in target/
Gradle: gradle build → Outputs in build/libs/
Docker: docker build -t my-app:latest . → Creates an image

2. Archiving Artifacts in Jenkins

In a Freestyle Project:
Go to Post-build Actions → Archive the Artifacts.
Specify files (e.g., target/*.jar, build/reports/**/*.pdf).
In a Pipeline (Jenkinsfile):

groovy
pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'mvn package'
}
}
}
post {
success {
archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
}
}
artifacts: File pattern to archive.
fingerprint: Tracks file usage across builds.

3. Storing Artifacts in a Repository

Instead of just archiving in Jenkins, push artifacts to:

Nexus/Artifactory (for Java/Python packages)
Docker Hub/ECR (for containers)
Amazon S3/GCS (for binaries)
Example: Upload to Nexus via Maven

groovy
stage('Deploy to Nexus') {
steps {
sh '''
mvn deploy:deploy-file \
-DgroupId=com.myapp \
-DartifactId=myapp \
-Dversion=1.0 \
-Dpackaging=jar \
-Dfile=target/myapp.jar \
-DrepositoryId=nexus \
-Durl=http://nexus.example.com/repository/maven-releases/
'''
}
}
Example: Push Docker Image

groovy
stage('Push Docker Image') {
steps {
script {
docker.withRegistry('https://registry.example.com', 'docker-creds') {
docker.image('my-app:latest').push()
}
}
}
}
4. Downloading Artifacts in Jenkins

From Another Job: Use the Copy Artifact Plugin:
groovy
steps {
copyArtifacts projectName: 'upstream-job', selector: lastSuccessful()
}
From a Repository: Use curl, wget, or SDKs (e.g., AWS CLI for S3).

5. Best Practices for Artifacts

Name Clearly (e.g., myapp-1.0.0.jar, not just app.jar).
Store Immutably (Never overwrite versions; use -SNAPSHOT for dev).
Clean Up Old Artifacts (Set retention policies in Jenkins/Nexus).
Sign Artifacts (Use GPG/PGP for security).
Track Dependencies (Link artifacts to commits/tickets).

## Common Tools for Artifact Management

Tool	      Purpose
Nexus	      Hosts Java/Python/NPM packages.
Artifactory	  Universal artifact repository.
Docker Hub	  Stores container images.
Amazon S3	  Stores binaries/logs.

Example: Full Jenkins Pipeline with Artifacts

groovy
pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'mvn package'
}
}
stage('Test') {
steps {
sh 'mvn test'
junit 'target/surefire-reports/*.xml'  // Archive test reports
}
}
stage('Deploy') {
steps {
nexusArtifactUploader(
nexusVersion: 'nexus3',
protocol: 'http',
nexusUrl: 'nexus.example.com',
groupId: 'com.myapp',
version: '1.0',
repository: 'maven-releases',
credentialsId: 'nexus-creds',
artifacts: [
[artifactId: 'myapp',
type: 'jar',
file: 'target/myapp.jar']
]
)
}
}
}
post {
always {
archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
}
}

## Troubleshooting Artifacts

-- "File not found": Check paths in archiveArtifacts.
-- Upload failures: Verify repository permissions/credentials.
-- Corrupted files: Use checksums (e.g., sha256sum).

