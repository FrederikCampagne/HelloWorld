pipeline {
	agent any

	stages{
		stage('Build'){
		    node {
		        bat './gradlew clean assemble'		        
		    }
		}	  
		stage('Launch'){
		    node {
					bat 'java -jar ./build/libs/HelloWorld-0.0.1-SNAPSHOT.jar'
		    }
		
		}	  
		stage('Test'){
		    node {
		        bat './gradlew clean test'
		    }
		
		}	    
	}
}

