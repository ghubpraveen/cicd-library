def call(paramsFile) {
    sh """
        echo "📦 Building WAR..."
        bash scripts/java_deployment.sh ${paramsFile}
    """
}
