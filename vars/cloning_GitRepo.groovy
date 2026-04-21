def call(String gitUrl, String gitBranch){
    echo "cloning repo from ${gitUrl} in branch ${gitBranch}"
    git url: "${gitUrl}", branch: "${gitBranch}"
}
