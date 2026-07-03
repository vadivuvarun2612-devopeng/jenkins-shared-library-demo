def call() {
    echo "======================================="
    echo "echo "Running Build from Develop Branch""
    bat "mvn clean package"
    echo "Maven Build Completed Successfully."
    echo "======================================="
}