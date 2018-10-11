#!/usr/bin/env groovy

def call() {
    stage('credential') {
        withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
            echo "Hello!!!"
            sh "echo ${username} ${password}"
        }
    }
}
