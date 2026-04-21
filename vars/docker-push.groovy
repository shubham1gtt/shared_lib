def call(String dockerHubUser, String projectName, String imageTag){
  withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'DockerUser', passwordVariable: 'dockerHubPassword')]){
    sh "docker login -u ${DockerUser} -p ${dockerHubPassword}"
  }
 sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
}

def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
