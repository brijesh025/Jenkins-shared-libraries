def call(String ProjectName, String ImageTag, String DockeHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
