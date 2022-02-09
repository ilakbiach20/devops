pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean verify'
            }

        }

        stage ('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: '99f59922-9420-443f-964e-81319e2a2597', path: '', url: 'http://localhost:1111')], contextPath: 'greeting', war: 'myfilewar'
            }
        }
    }

}