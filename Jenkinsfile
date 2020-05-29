pipeline {
    agent any
    
    tools {
        maven 'M3'
    }
    stages {
        stage ('Build back') {
            steps {
                sh "mvn clean install -DskipTests=true"
            }
        }
        stage ('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage ('Sonar Analysis') {
            environment {
                scannerHome = tool 'SONAR_SCANNER'
            }
            steps {
                withSonarQubeEnv('SONAR_LOCAL') {
                    sh "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=SONAR_SMART_CAR -Dsonar.host.url=http://localhost:9000 -Dsonar.login=dceebb57eb017156d4830137f01ea457810c0e25 -Dsonar.java.binaries=target"
                }
            }
        }
        stage ('Copiar arquivo') {
            steps {
                echo pwd()
                sh "cp -ar /Users/ildsonmoraes/Documents/Estudos/Projetos/Jenkins/arq.txt /Users/ildsonmoraes/.jenkins/workspace/Pipeline/src/main/resources/"
            }
        }
    }

}

  