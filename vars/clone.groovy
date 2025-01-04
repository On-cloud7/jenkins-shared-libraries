def call(String url, String branch){
  echo "this is cloning code"
  git url:"https://github.com/On-cloud7/django-notes-app.git", branch:"main"
  echo:"code cloning is successful"
