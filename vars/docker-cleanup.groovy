def call(String dockerHubUser, String projectName, String imageTag){
 sh "docker rmi  ${dockerHubUser}/${projectName}:${imageTag}"
}
