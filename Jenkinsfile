pipeline {
    agent any
    
    tools {
        maven 'M3'
    }
    stages {
        stage ('Build back') {
            steps {
                sh "mvn clean install -DskipTests"
            }
        }
        stage ('Meio') {
            steps {
                sh 'echo meio'
                sh 'echo meio de novo'
            }
        }
        stage ('Fim') {
            steps {
                sleep(5)
                sh 'echo fim'
            }
        }
    }

}