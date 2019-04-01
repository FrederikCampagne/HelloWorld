pipeline {
	agent {
		docker.image('light:lightweight').withRun('-p 9091:9091'){ c ->
		    sh '${c}'
		    }

		
	}
			
	stages {
		stage('E2E & integration Tests'){
			    steps {
			    	sh 'chmod +x ./gradlew'
			        sh './gradlew inteTest'
		    	}
		}		      
	}
}

