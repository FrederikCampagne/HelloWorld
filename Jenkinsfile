pipeline {
	agent any
	
	


			
	stages {
		
		stage('nothing'){
		    steps{
		        containerId = sh(script: 'docker run -d -p 9091:9091 light:lightweight', returnStdout: true)
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

