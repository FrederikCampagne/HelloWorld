pipeline {
	agent {
		docker {
			image 'lightweight'
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

