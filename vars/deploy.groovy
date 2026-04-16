def call(paramsFile) {

    def libPath = pwd() + "@libs"

    sh """
        echo "🔍 Detecting library path..."
        ls -ltr ${libPath}

        SCRIPT_PATH=\$(find ${libPath} -name deploy.sh | head -n 1)

        echo "Using script: \$SCRIPT_PATH"

        chmod +x "\$SCRIPT_PATH"
        bash "\$SCRIPT_PATH" "${paramsFile}"
    """
}
