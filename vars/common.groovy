def compile() {
    if (app_lang == "node.js") {
        sh 'npm install'
        sh 'env'
    }
    if (app_lang == "maven") {
        sh  'mvn package'
        sh 'env'
    }
    if (app_lang == "go") {
        sh  'go mod init dispatch'
        sh  'go get'
        sh 'go build'
        sh 'env'
    }
}

def unittests() {

    if (app_lang == "node.js") {
        // Developer is missing unit test cases in our project, we are forcefully passing the test
        // To report this issue to dev team; we need to use "exception handling" with try/catch groovy..
      sh 'npm test'
      sh 'env'
    }
    if (app_lang == "maven") {
        sh 'mvn test'
        sh 'env'
    }
    if (app_lang == "go") {
        sh  'go mod init dispatch'
        sh 'env'
    }
    if (app_lang == "python") {
        sh  'python3 -m unittest'
        sh 'env'
    }

}

def email(emial_note) {
    mail bcc: '', body: "JobFailed - ${JOB_BASE_NAME}\nJenkins URL- ${JOB_URL}", cc: '', from: 'kkr@bcmonline.com', replyTo: '', subject: "Jenkins Job Failed - ${JOB_BASE_NAME}", to: 'myteam@bcmonline.com'
}