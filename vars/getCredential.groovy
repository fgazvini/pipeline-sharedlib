#!/usr/bin/env groovy

def call() {
    withCredentials([usernamePassword(credentialsId: 'sonar-secrets', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
       sh '''echo  ${PASSWORD}'''
       sh '''echo ${USERNAME} > ./credentials.txt'''
       sh '''echo "username is: ${USERNAME}" >> ./credentials.txt'''
   }
}
