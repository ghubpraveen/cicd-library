def call(paramsFile) {
    def scriptPath = "${env.WORKSPACE}@libs/cicd-library/scripts/deploy.sh"

    sh """
        echo "📦 Building WAR..."
        bash ${scriptPath} ${paramsFile}
    """
}
