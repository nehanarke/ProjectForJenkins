pipeline {
    agent any

    tools 
    {
        maven 'Maven3'
        jdk 'Java 17'
    }


     
    stages 
    {

        stage('Build & Test')
         {
            steps
             {
                bat 'mvn clean test'  // Use 'sh' on Linux/macOS
            }
        }

        stage('Test Report') 
        {
            steps 
            {
                junit '**/surefire-reports/*.xml'
            }
        }
    }
}
