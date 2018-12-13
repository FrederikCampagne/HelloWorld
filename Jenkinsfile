pipeline {
	agent any

	stages{
		stage('Build'){
		    steps {
		        bat './gradlew clean assemble'
		    }
		}	  
		stage('Deploy'){
		    steps {
					bat './gradlew cargoDeployRemote'
		    }
		
		}	  
		stage('Test'){
		    steps {
		        bat './gradlew test'
		    }
		}	    
	}
}

