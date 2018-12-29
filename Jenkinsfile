pipeline{
	agent any
	stages{
		stage('Compile step'){
			steps{
				maven(maven : 'Maven3'){
					bat 'mvn clean compile'
				}
			}
		}
		stage('Test step'){
			steps{
				maven(maven : 'Maven3'){
					bat 'mvn test'
				}
			}
		}
		stage('Deploy step'){
			steps{
				maven(maven : 'Maven3'){
					bat 'mvn deploy'
				}
			}
		}
	}
}