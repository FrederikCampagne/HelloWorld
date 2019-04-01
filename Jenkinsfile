pipeline {
	agent {
	    
	     docker {
	     	image 'frederikcampagne/tainnovationteam'
	     	args '-p 9091:9091'
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

