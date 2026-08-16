pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Wallet API...'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Unit Test') {
            steps {
                echo 'Running unit tests...'
                bat 'mvn test'
            }
        }

        stage('Deploy DEV') {
            when {
                not {
                    branch 'master'
                }
            }
            steps {
                echo 'Deploying application to DEV environment...'
                echo 'DEV deployment placeholder'
            }
        }

        stage('Integration Test') {
            when {
                branch 'release'
            }
            steps {
                echo 'Running integration tests...'
                echo 'Integration testing placeholder'
            }
        }

        stage('Deploy QA') {
            when {
                branch 'release'
            }
            steps {
                echo 'Deploying application to QA environment...'
                echo 'QA deployment placeholder'
            }
        }

        stage('QA Approval') {
            when {
                branch 'release'
            }
            steps {
                input message: 'QA testing completed successfully. Continue to UAT?',
                      ok: 'Approve QA'
            }
        }

        stage('Deploy UAT') {
            when {
                branch 'release'
            }
            steps {
                echo 'Deploying application to UAT environment...'
                echo 'UAT deployment placeholder'
            }
        }

        stage('UAT Approval') {
            when {
                branch 'release'
            }
            steps {
                input message: 'UAT testing completed successfully. Deploy to PROD?',
                      ok: 'Approve Production'
            }
        }

        stage('Deploy PROD') {
            when {
                branch 'release'
            }
            steps {
                echo 'Deploying application to PROD environment...'
                echo 'PROD deployment placeholder'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }

        failure {
            echo 'Pipeline failed. Deployment must stop.'
        }
    }
}