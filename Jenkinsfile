pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/mdsaquibabbas313/springboot-application.git'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                withCredentials([string(credentialsId: 'db-password', variable: 'DB_PASSWORD')]) {
                    sh './mvnw clean package'
                }
            }
        }
    }
}