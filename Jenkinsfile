pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Build started'
                sh 'ls -al'
            }
        }

        stage('Test') {
            steps {
                echo 'Test started'
            }
        }
    }

    post {
        success {
            echo 'Build succeeded'
        }

        failure {
            echo 'Build failed'
        }
    }
}