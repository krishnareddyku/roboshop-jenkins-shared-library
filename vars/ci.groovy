def call () {

   pipeline {
	agent {
	label 'any'
	}
	
	stages {
		stage('compile/build') {
			steps {
			  script {
               common.compile
              }
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
