pipeline {
	agent any
	
	environment{    
		def containerId = ''
	}


			
	stages {
		
		stage('nothing'){
			
		    steps{
		    	script {
		    	     containerId = sh(script: 'docker run -d -p 9091:9091 light:lightweight', returnStdout: true)
		    	}

		        echo "joehoe ${containerId}"
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

