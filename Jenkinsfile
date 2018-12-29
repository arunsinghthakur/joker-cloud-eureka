pipeline{
	agent any
	stages{
		stage('Compile step'){
			steps{
				withMaven(maven : 'Maven3'){
					sh 'mvn clean compile'
				}
			}
		}
		stage('Test step'){
			steps{
				withMaven(maven : 'Maven3'){
					sh 'mvn test'
				}
			}
		}
		stage('Deploy step'){
			steps{
				withMaven(maven : 'Maven3'){
					sh 'mvn deploy'
				}
			}
		}
	}
}