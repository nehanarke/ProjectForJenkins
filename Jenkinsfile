pipeline {
    agent any

    tools {
        maven 'Maven_3.8.9'
        jdk 'jdk-11'
    }

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/nehanarke/ProjectForJenkins.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'  // Use 'sh' on Linux/macOS
            }
        }

        stage('Test Report') {
            steps {
                junit '**/test-output/testng-results.xml'
            }
        }
    }
}
