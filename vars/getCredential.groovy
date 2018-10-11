#!/usr/bin/env groovy

def call() {
withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
                sh """echo "${username} ${password}"""
            }
}
