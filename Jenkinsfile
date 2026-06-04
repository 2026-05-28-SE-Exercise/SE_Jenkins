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
                sh 'javac Test.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Test started'
                sh 'java Test Kang 88'
            }
        }
    }

    post {
        success {
            echo 'Build succeeded'

            sh '''
                echo "Build Success" > build-result.txt
                echo "Project: SE_Jenkins" >> build-result.txt
                echo "Result: SUCCESS" >> build-result.txt
                echo "Build Number: ${BUILD_NUMBER}" >> build-result.txt
                echo "Build URL: ${BUILD_URL}" >> build-result.txt
                echo "Date: $(date)" >> build-result.txt
            '''
            archiveArtifacts artifacts: 'build-result.txt', allowEmptyArchive: true
        }

        failure {
            echo 'Build failed'

            sh '''
                echo "Build Failed" > build-result.txt
                echo "Project: SE_Jenkins" >> build-result.txt
                echo "Result: FAILURE" >> build-result.txt
                echo "Build Number: ${BUILD_NUMBER}" >> build-result.txt
                echo "Build URL: ${BUILD_URL}" >> build-result.txt
                echo "Date: $(date)" >> build-result.txt
            '''
            archiveArtifacts artifacts: 'build-result.txt', allowEmptyArchive: true
        }
    }
}