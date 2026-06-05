def call(String client, String server){
  withCredentials([usernamePassword(
    "credentialsId": "dockerUserCred",
    passwordVariable: "dockerHubPass",
    usernameVariable: "dockerHubUser"
  )]){
  sh "cd ${client} && docker build -t ${env.dockerHubUser}/${client} ."
  sh "cd ${server} && docker build -t ${env.dockerHubUser}/${server} ."
  }
}
