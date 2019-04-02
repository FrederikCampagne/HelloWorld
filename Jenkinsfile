pipeline {
	agent any
	
	environment{
		def containerId	= ''    
	}

			
	stages {
		stage('Start container' ) {
		    steps {
				containerId = sh 'docker run -d -p 9091:9091 light:lightweight'                                                    
		    }
                        
		}

		stage('E2E & integration Tests'){
			    steps {   
			    	sh 'chmod +x ./gradlew'
			        sh './gradlew inteTest'
		    	}
		}	
		
		stage('Stop container' ){	 	
				steps{
				    sh "docker stop ${containerId}"
				    sh "docker rm ${containerId}" 
				}

		}
	      
	}
}

