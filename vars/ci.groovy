def call () {

   pipeline {
	agent {
	label 'kk'
	}
	
	stages {
		stage('compile/build') {
			steps {
			echo "compile"
			}
		}
		stage('Unit tests') {
                        steps {
                        echo "unit tests"
                        }
                }
		stage('Quality Control') {
                        steps {
                        echo "Quality control"
                        }
                }
		stage('upload code to centralized place') {
                        steps {
                        echo "upload code to centralized place"
                        }
                }
	}

   }

}
