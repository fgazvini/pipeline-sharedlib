#!/usr/bin/env groovy

def call(args) {
    node {
        withCredentials([usernamePassword(credentialsId: 'sonar-secrets', passwordVariable: 'password', usernameVariable: 'username')]) {
            echo args
            echo "${PATH}"
            sh 'echo ${PATH}'
            sh 'echo ${HOME}'
            sh 'ls -l ${HOME}'
            sh 'echo ${username} ${password} > ./credential.txt'
            withEnv(['PATH=${env.M2_HOME}:$PATH']) {
                sh 'mvn -version'
//            sh '$MYTOOL_HOME/bin/mvn -version'
  }
        }
    }
}
