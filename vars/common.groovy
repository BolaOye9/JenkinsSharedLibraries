def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "deploy"
     }
}
