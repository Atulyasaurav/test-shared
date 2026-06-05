def call(String client, String server, String username){
  sh "cd ${client} && docker build -t ${username}/${client} ."
  sh "cd ${server} && docker build -t ${username}/${server} ."
}
