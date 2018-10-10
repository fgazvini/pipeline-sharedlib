#!/usr/bin/env groovy

def call(String name = 'human') {
    withCredentials([usernamePassword(credentialsId: 'sonar-secrets', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
       sh 'echo  $PASSWORD'
       echo USERNAME > credentials.txt
       echo "username is: $USERNAME" >> ./credentials.txt
   }
}
