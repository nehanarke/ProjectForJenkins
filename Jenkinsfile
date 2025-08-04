pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'Java 17'
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
