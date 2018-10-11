#!/usr/bin/env groovy

def call() {
  stage('test') {
           withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
                echo "Hello!!!"
                sh 'echo $username $password'
            }
  }
}
