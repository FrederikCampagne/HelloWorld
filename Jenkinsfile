pipeline {
	agent {
		docker {
			image 'lightweight'
		}
	}
			
	stage('E2E & integration Tests'){
		    steps {
		        sh './gradlew inteTest'
		    }
		}		      
	}
}

