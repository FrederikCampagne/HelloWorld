pipeline {
	agent any
		
			
	stages {

		stage('E2E & integration Tests'){
			    steps {
			    docker.image('light:lightweight').run('-p 9091:9091')   
			    	sh 'chmod +x ./gradlew'
			        sh './gradlew inteTest'
		    	}
		}		      
	}
}

