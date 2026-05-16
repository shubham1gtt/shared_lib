def call(String SonarQubeAPI, Projectname, ProjectKey){
   withSonarQubeEnv("${SonarQubeAPI}"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -Dsonar.java.binaries=. -X"
  }
}
