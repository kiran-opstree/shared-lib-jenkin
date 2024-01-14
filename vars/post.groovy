def call() {
    success {
            slackSend channel: '#pipeline-dec', color: 'good', message: "Job '${env.JOB_NAME}' Success!", teamDomain: 'kiran-workspacegroup', tokenCredentialId: 'df4374b7-51c5-4d43-8297-a5e1971ef969	'
        }
    failure {
            // Notify on failure 'Secret text'
            slackSend channel: '#pipeline-dec', color: 'danger', message: "Job '${env.JOB_NAME}' Failed!", teamDomain: 'kiran-workspacegroup', tokenCredentialId: 'df4374b7-51c5-4d43-8297-a5e1971ef969'
    }
}
