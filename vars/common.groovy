def compile() {
    if (app_lang == "node.js") {
        echo "npm install"
    }
    if (app_lang == "maven") {
        sh  "mvn package"
    }
    if (app_lang == "go") {
        sh  "go mod init dispatch"
        sh  "go get"
        sh "go build"
    }
}