pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9' // Make sure this is the name configured in Jenkins tools
        jdk 'JDK 21'         // Replace with your installed JDK name
    }

    environment {
        // Any environment variables if needed
    }
stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Manjuri12345/cucumber.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        
        stage('Archive Reports') {
            steps {
                junit 'target/surefire-reports/parameter.xml' // default TestNG output location
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Tests passed!'
        }
        failure {
            echo 'Tests failed.'
        }
    }
}