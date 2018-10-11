#!/usr/bin/env groovy

def call(args) {
    node {
        withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
            echo args
            echo "${PATH}"
            sh 'echo ${username} ${password} > ./credential.txt'
        }
    }
}
