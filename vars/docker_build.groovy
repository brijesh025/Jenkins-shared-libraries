def call(String ImageName, String ImageTag, String DockeHubUser){
  sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}
