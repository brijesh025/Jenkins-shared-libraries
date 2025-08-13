def call(String GitUrl, String GitBranch){
  echo "This cloning the repo using shared libs"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Cloning Done proceeding to next stage"
}
