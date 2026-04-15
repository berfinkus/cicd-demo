pipeline {
    agent any

    stages {
        stage('Kodu Al') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/berfinkus/cicd-demo.git'
            }
        }

        stage('Build Al') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Docker Image Oluştur') {
            steps {
                sh 'docker build -t cicd-demo:latest .'
            }
        }

        stage('Docker Container Çalıştır') {
            steps {
                sh 'docker stop cicd-demo || true'
                sh 'docker rm cicd-demo || true'
                sh 'docker run -d --name cicd-demo -p 8090:8080 cicd-demo:latest'
            }
        }
    }

    post {
        success {
            echo 'Uygulama başarıyla yayınlandı!'
        }
        failure {
            echo 'Bir hata oluştu!'
        }
    }
}
