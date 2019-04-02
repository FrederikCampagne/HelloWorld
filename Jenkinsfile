pipeline {
	agent any

		
			
	stages {
		stage('Start container' ) {
		    steps {
				sh 'docker run -p 9091:9091 light:lightweight'                                                    
		    }
                        
		}

		stage('E2E & integration Tests'){
			    steps {   
			    	sh 'chmod +x ./gradlew'
			        sh './gradlew inteTest'
		    	}
		}		      
	}
}

