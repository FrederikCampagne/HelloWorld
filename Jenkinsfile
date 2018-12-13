pipeline {
	agent any

	stages{
		stage('Build'){
		    steps {
		        bat './gradlew clean assemble'
		    }
		}	  
		
		stage('Test'){
		    steps {
		        bat './gradlew cargoStartLocal test cargoStopLocal'
		    }
		}	
		
		stage('Deploy'){
		    steps {
					bat './gradlew cargoRedeployRemote --info'
		    }
		
		}	      
	}
}

