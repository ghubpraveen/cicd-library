def call(paramsFile) {
    sh """
        echo "🐳 Building Docker image..."
        bash scripts/docker_build.sh ${paramsFile}
    """
}

