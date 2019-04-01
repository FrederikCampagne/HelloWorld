pipeline {
	agent any
			
	node {
	
	  docker.image('light:lightweight').run('-p 9091:9091')
	
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

