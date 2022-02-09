pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean verify'
            }
        }
        stage('Build, Test, Release'){
                        steps {
                            rtMavenDeployer (
                                id: 'artifactory',
                                serverId: 'artifactory',
                                releaseRepo: 'maven-libs-release-local',
                                snapshotRepo: 'maven-libs-snapshot-local'
                            )

                            rtMavenRun (
                                tool: 'Maven 3.8.4',
                                pom: 'pom.xml',
                                goals: 'clean install',
                                deployerId: 'artifactory',
                            )
                        }
                    }
        stage('Deploy'){
            steps{
                deploy adapters: [tomcat9(credentialsId: '99f59922-9420-443f-964e-81319e2a2597', path: '', url: 'http://localhost:1111')], contextPath: 'greeting', war: 'target/greeting.war'
            }
        }
    }

}