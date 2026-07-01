def call() {
    echo "=============================="
    echo "Starting Maven Build..."
    bat 'mvn clean package'
    echo "Build completed successfully."
    echo "=============================="
}