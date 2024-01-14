def call() {
    script {
        try {
        currentBuild.resultIsBetterOrEqualTo('SUCCESS')
        // Notify on success
        slackSend channel: '#pipeline-dec', color: 'good', message: "Job '${env.JOB_NAME}' Success!", teamDomain: 'kiran-workspacegroup', tokenCredentialId: 'df4374b7-51c5-4d43-8297-a5e1971ef969'
        } 
        catch (Exception e) {
        // Notify on failure
        slackSend channel: '#pipeline-dec', color: 'good', message: "Job '${env.JOB_NAME}' Success!", teamDomain: 'kiran-workspacegroup', tokenCredentialId: 'df4374b7-51c5-4d43-8297-a5e1971ef969'
        throw e
        }
    }
}
    
