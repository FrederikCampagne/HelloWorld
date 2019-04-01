pipeline {
	agent {
	    
	     docker {
	     	image 'light:lightweight'
	     	args 'docker run -p 9091:9091'
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

