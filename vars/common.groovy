def compile() {
    if (app_lang == "node.js") {
        echo "npm install"
    }
    if (app_lang == "maven") {
        sh  "mvn package"
    }
}