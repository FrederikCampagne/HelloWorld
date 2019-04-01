pipeline {
	agent any
			
	stages {
		stage('Start Application'){
		    steps{
		        
		    docker.image('light:lightweight').run('-p 9091:9091')	
		        
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

