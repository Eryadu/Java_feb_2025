Jenkins - Automate, build, test, deploy
IDE - Integrated development environment ( we can write code, compile, and see output)

CRON job-- Crontab.guru to scheduler ?

SCM source code management
Poll SCM? Jenkins wait for any change on git-hub, if there is any change on git-hub it trigger pipeline, it builds
Master-Slave ? Orcestra ? Agent ?

http://ec2-107-21-72-250.compute-1.amazonaws.com:8080

pipeline {
agent any

    stages {
        stage('Clone github') {
            steps {
                git branch: 'main', url: 'https://github.com/Surinder07/pragra-jenkins.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SONAR ') {
            steps {
                echo 'checking code quality ....'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }
        
        stage('Deploy DEV1') {
            steps {
                echo 'DEV 1 deployment...'
            }
        }
        
        stage('Deploy DEV2') {
            steps {
                echo 'DEV 1 deployment...'
                sleep 10
            }
        }
        
        stage('Deploy Staging') {
            steps {
                echo 'DEV 1 STAGING...'
                sleep 10
            }
        }
        
        stage('Deploy PROD') {
            steps {
                echo 'Deploy to PROD'
                sleep 30
            }
        }
        
    }
}

cat /Users/yadavgupta/.jenkins/secrets/initialAdminPassword use this command to open jenkin on local to find password

to start / stop jenkins   brew services start jenkins-lts

https://github.com/Eryadu/Maven_Feb_2025_Java