#!/usr/bin/env groovy

def call(def server, def port) {
   httpRequest httpMethod: 'POST', url: "http://${server}:${port}/shudown", validResponseCodes: '200,408'
   sshAgent(credential: ['ssh-centos2-node1']) {
      sh "scp target/*.jar jenkins@${server}:/tmp/springboot-demo.jar"
      sh "ssh jenkins@${server} nohup java -Dserver.port=${port} -jar /tmp/springboot-demo.jar"
   }
   retry(3) {
     sleep 5
     httpRequest url:"http://${server}:${port}/health", validResponseCodes: '200', validResponseContent: '"status":"UP"'
   }
}
