def call(paramsFile) {

    def scriptPath = "${env.WORKSPACE}@libs/cicd-library/scripts/deploy.sh"

    sh """
        echo "🚀 Running deploy.sh..."
        ls -ltr ${env.WORKSPACE}@libs/cicd-library/scripts/

        chmod +x "${scriptPath}"
        bash "${scriptPath}" "${paramsFile}"
    """
}
