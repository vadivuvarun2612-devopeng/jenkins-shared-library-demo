def call() {
    echo "======================================="
    echo "Running Unit Tests..."
    bat "mvn test"
    echo "Unit Tests Completed Successfully."
    echo "======================================="
}