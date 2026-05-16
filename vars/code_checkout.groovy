def call(string GitUrl, string GitBranch){
  git url: "$(GitUrl)","$(GitBranch)" 
}

or i can write this as well if requirement is like , will not  change the git url and branch and also dont want to show this on jenkins pipeline
def call(){

 git url: "https://github.com/LondheShubham153/Wanderlust-Mega-Project.git", branch: "main"
}
