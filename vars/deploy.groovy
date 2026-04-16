def call(paramsFile) {
    sh """
        echo "🚀 Deploying application..."
        bash scripts/deploy.sh ${paramsFile}
    """
}
