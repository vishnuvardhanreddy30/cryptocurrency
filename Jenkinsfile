pipeline {
    agent any
    stages {
        stage('Git') {
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/featurecryptocurrencylookup']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/vishnuvardhanreddy30/cryptocurrencylookup.git']]])
            }
        }
        stage('Build') {
            steps{
                bat 'mvn clean install'
            }
        }
        
        }
        post {
            always {
                junit (
                    allowEmptyResults:true, 
                    testResults: '*test-reports/.xml'
                )
            }
    }
}