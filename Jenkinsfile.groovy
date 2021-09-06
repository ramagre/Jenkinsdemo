pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				 echo 'Hello Blaze Team'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('Production') {
            steps {
                echo 'Live on production'
            }
        }
    }
}
© 2021 GitHub, Inc.