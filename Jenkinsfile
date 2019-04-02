pipeline {
	agent any
	
	environment{
	sh 'docker run -d -p 9091:9091 light:lightweight > result'   
				def output=readFile('result').trim()
				  
		def containerId	= ''
		containerId = output    
	}

			
	stages {

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

