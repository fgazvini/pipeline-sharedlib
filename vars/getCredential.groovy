#!/usr/bin/env groovy

def call(args) {
    node {
        withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
            echo args
            sh 'echo ${env.PATH}'
            sh 'echo ${username} ${password} > ./credential.txt'
        }
    }
}
