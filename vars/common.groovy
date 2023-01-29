def compile() {
    if (app_lang == "node.js") {
        sh 'npm install'
    }
    if (app_lang == "maven") {
        sh  'mvn package'
    }
    if (app_lang == "go") {
        sh  'go mod init dispatch'
        sh  'go get'
        sh 'go build'
    }
}

def unittests() {

    if (app_lang == "node.js") {
        // Developer is missing unit test cases in our project, we are forcefully passing the test
        // To report this issue to dev team; we need to use "exception handling" with try/catch groovy..
      sh 'npm test'
    }
    if (app_lang == "maven") {
        sh 'mvn test'
    }
    if (app_lang == "go") {
        sh  'go mod init dispatch'
    }
    if (app_lang == "python") {
        sh  'python3 -m unittest'
    }

}

def email(emial_note) {
    println email_note
}