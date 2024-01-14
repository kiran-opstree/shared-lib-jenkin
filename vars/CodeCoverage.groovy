def call() {
    def mvnHome = tool 'maven3'
    sh 'mvn cobertura:cobertura'
}
