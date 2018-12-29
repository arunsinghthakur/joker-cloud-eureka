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
				bat 'mvn test'
			}
		}
		stage('Deploy step'){
			steps{
				bat 'mvn deploy'
			}
		}
	}
}