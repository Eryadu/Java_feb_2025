## How to start jenkin on local machine

🧰 Option 1: Using Jenkins WAR File (Quickest Way)
✅ Steps:

Download the WAR file:
From: https://www.jenkins.io/download/
Look for "Generic Java package (.war)"
Run Jenkins using Java:
java -jar jenkins.war
Access Jenkins in browser:
Open: http://localhost:8080
Initial Admin Password:
Check this file:
cat ~/.jenkins/secrets/initialAdminPassword
🐳 Option 2: Using Docker
✅ Steps:

Make sure Docker is installed and running
Run Jenkins container:
docker run -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts
Access Jenkins:
Open http://localhost:8080
Initial admin password:
From the logs or:
docker exec <container-id> cat /var/jenkins_home/secrets/initialAdminPassword
📦 Option 3: Using a Package Manager (Ubuntu or macOS)
🐧 On Ubuntu:

sudo apt update
sudo apt install openjdk-11-jdk
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt update
sudo apt install jenkins
sudo systemctl start jenkins
Then go to http://localhost:8080

🍎 On macOS (with Homebrew):

brew install jenkins-lts
brew services start jenkins-lts
Access: http://localhost:8080

