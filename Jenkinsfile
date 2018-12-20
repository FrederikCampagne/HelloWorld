pipeline {
	agent any

	stages{
		stage('Build'){
		    steps {
		        sh './gradlew clean assemble'
		    }
		}	  
		
		stage('Unit Tests'){
		    steps {
		        sh './gradlew test'
		    }
		}
		
		stage('E2E & integration Tests'){
		    steps {
		        sh './gradlew cargoStartLocal inteTest cargoStopLocal'
		    }
		}	
		
		stage('Deploy'){
		    steps {
					sh './gradlew cargoRedeployRemote'
		    }
		
		}	      
	}
}

