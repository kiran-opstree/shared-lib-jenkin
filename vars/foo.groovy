def call(String name = 'Ninjas') {
    echo "Hello, ${name}."
}

def gitClone() {
    stage('Code Checkout') {
        git branch: 'java7', url: 'https://github.com/opstree/spring3hibernate.git'
    }
}    
    
def unitTest() {
    stage('Unit Testing') {
        sh 'mvn checkstyle:checkstyle'
        sh 'mvn findbugs:findbugs'
        sh 'mvn pmd:pmd'
    }
}

def dependencyCheck() {
    stage('Dependency Check') {
        sh 'mvn dependency-check:check'
    }
}

def codeCoverage() {
    stage('Code Coverage') {
        sh 'mvn cobertura:cobertura '
    }
}
