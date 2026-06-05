def call(String url, String branch){
  echo "Clonning code"
  git url: "${url}", branch:"${branch}"
  echo "Clone successful...
}
