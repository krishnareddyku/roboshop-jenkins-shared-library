def compile {
    if (app-lang == "node.js") {
        sh 'npm install'
    }
}