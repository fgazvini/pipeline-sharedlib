#!/usr/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'sonar-secrets', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
       echo "Password is: ${PASSWORD}"
}
