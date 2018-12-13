pipeline {
	agent any

	stages{
		stage('Build'){
		    steps {
		        bat './gradlew clean assemble'
		    }
		}	  
		
		stage('Unit Tests'){
		    steps {
		        bat './gradlew test'
		    }
		}
		
		stage('E2E & integration Tests'){
		    steps {
		        bat './gradlew cargoStartLocal inteTest cargoStopLocal'
		    }
		}	
		
		stage('Deploy'){
		    steps {
					bat './gradlew cargoRedeployRemote --info'
		    }
		
		}	      
	}
}

