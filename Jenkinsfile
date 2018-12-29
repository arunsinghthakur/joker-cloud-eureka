pipeline{
	agent any
	stages{
		stage('Compile step'){
			steps{
					bat 'mvn clean compile'
			}
		}
		stage('Test step'){
			steps{
				withMaven(maven : 'Maven3'){
					bat 'mvn test'
				}
			}
		}
		stage('Deploy step'){
			steps{
				withMaven(maven : 'Maven3'){
					bat 'mvn deploy'
				}
			}
		}
	}
}