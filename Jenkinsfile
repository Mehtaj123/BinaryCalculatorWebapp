pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Init') {
            steps {
                echo 'Welcome! Starting the Binary Calculator pipeline.'
                sh 'pwd'
                sh 'ls -la'
            }
        }

        stage('test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('build') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy stage placeholder — actual deployment is handled by the CI/CD pipeline (Jenkinsfile_v2).'
            }
        }
    }
}