
cat /Users/yadavgupta/.jenkins/secrets/initialAdminPassword use this command to open jenkin on local to find password

to start / stop jenkins   brew services start jenkins-lts

## Jenkins is an open-source automation server used for CI/CD (Continuous Integration and Continuous Delivery).
   It automates building, testing, and deploying software.
## Jenkins is an open source project written in Java that runs on windows, macOD and others unix like operating systems.
-- Major reason to use Jenkins : It is free, Community Supported and might be your first choice tool for CI.
-- Jenkins was originally developed by Sun Microsoft in 2004, under the name Hudson. The project was later named jenkins
   when Oracle bought Microsoft. It can be run on any major platform without any compatibility issues.

## Jenkins ? is platform to automate your code like make build , test it, make .jar file . We can use different software on Jenkins
platform, but we have to tell all the things by manually to jenkins.
-- Jenkins is not a tool only it is framework as well means we can change plugging according to our need
for example if we don't want jenkins is totally automated, like we  want to do test by our-self not by jenkins, so we
can change it as its framework.
-- Jenkins work on Master-Slave architecture, master divide the work among slaves, if slave is not available, Master(Jenkins)
will do itself.
-- Label - jenkins mark label, means which slave will do which work.
-- Jenkins is written in java .
-- Jenkins also behave as CRON Server replacement i.e. Can be scheduled task, at what time build trigger
-- Artifactory-- for archiving purpose mean it stores final code that ready for future or to deliver to someone
as git-hub store raw code or source code, on which we are currently working

1. Setting Up Jenkins
-- Unlock Jenkins (using the initial password).
-- Install Suggested Plugins (Git, Pipeline, Maven, etc.).
-- Create Admin User (set username & password).
-- Configure Jenkins URL (default: http://localhost:8080).

2. Creating Your First Jenkins Job

## Freestyle Project (Simple Build)
-- Dashboard → New Item → Freestyle Project → Enter name (e.g., MyFirstJob).
-- Source Code Management → Git → Enter repository URL.
-- Build Triggers → Choose when to run (e.g., Poll SCM for Git changes).
-- Build Steps → Add:
-- Execute Shell (Linux) / Batch Command (Windows):
bash
echo "Building..."
mvn clean package
Save → Build Now → Check console output.

## Pipeline (Advanced CI/CD)

New Item → Pipeline → Enter name.
Pipeline Script (Jenkinsfile):
groovy
pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'mvn clean package'
}
}
stage('Test') {
steps {
sh 'mvn test'
}
}
stage('Deploy') {
steps {
sh 'echo "Deploying..."'
}
}
}
}
Save → Build Now → Watch stages execute.

3. Key Jenkins Features

-- Plugins	          Extend Jenkins (Docker, Kubernetes, AWS, Slack, etc.).
-- Distributed        Builds	Run jobs on multiple nodes (agents).
-- Pipeline as Code	  Define CI/CD in Jenkinsfile (Git-controlled).
-- Blue Ocean	      Modern UI for visualizing pipelines.
-- Webhooks	          Trigger builds on Git pushes (GitHub/GitLab).

4. Jenkinsfile Example (Declarative Pipeline)

groovy
pipeline {
agent any
stages {
stage('Checkout') {
steps {
git 'https://github.com/user/my-repo.git'
}
}
stage('Build') {
steps {
sh 'mvn clean package'
}
}
stage('Test') {
steps {
sh 'mvn test'
}
}
stage('Deploy') {
steps {
sh 'scp target/*.jar user@server:/deploy/'
}
}
}
post {
success {
slackSend message: "Build succeeded! ✅"
}
failure {
slackSend message: "Build failed! ❌"
}
}
}

5. Jenkins Best Practices

✅ Use Jenkinsfile (Store pipelines in Git).
✅ Run Tests in Parallel (Faster feedback).
✅ Secure Jenkins (Enable HTTPS, Role-Based Access Control).
✅ Clean Workspace (cleanWs() in pipelines).
✅ Monitor Jobs (Use Blue Ocean or Prometheus).

6. Troubleshooting

"No space left on device" → Clean old builds (Discard Old Builds in job config).
"Permission denied" → Ensure Jenkins user has access (sudo usermod -aG docker jenkins).
Git/GitHub Auth Issues → Use SSH keys or GitHub Personal Access Tokens.

## Upstream Linked Project means if we have two jobs : JOB A and JOB B,
after post build action when JOB A finish its job then it inform to JOB B to start its work, means its JOB A responsibility
to inform JOB B
## DownStream linked project means, JOB B wait for JOB A , when JOB A is done, JoB B start, so its JoB B itself responsibility
to take care, not JOB A.