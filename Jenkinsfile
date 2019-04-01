pipeline {
	agent {
		docker {
			image 'light/lightweight'
		}
	}
			
	stages {
		stage('E2E & integration Tests'){
			    steps {
			        sh './gradlew inteTest'
		    	}
		}		      
	}
}

