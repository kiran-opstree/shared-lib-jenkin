def call(String name = 'Ninjas') {
    echo "Hello, ${name}."
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
