pipeline {
	agent any

	stages{
		stage('Build'){
		    steps {
		        bat './gradlew clean assemble'
		    }
		
		}	  
		stage('Launch'){
		    steps {
		        bat 'java -jar ./build/libs/HelloWorld-0.0.1-SNAPSHOT.jar'
		    }
		
		}	  
		stage('Test'){
		    steps {
		        bat './gradlew clean test'
		    }
		
		}	    
	}
}

