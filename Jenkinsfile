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
        stage ('Fim') {
            steps {
                sleep(5)
                sh 'echo fim'
            }
        }
    }

}