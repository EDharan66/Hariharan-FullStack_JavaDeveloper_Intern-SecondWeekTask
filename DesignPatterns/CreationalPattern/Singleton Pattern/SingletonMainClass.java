public class SingletonMainClass {
    public static void main(String[] args) {

        // here getting a singleton instance

        LazyInitializedSingleton LazySingleton = LazyInitializedSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

        LazySingleton.showMessage();
        threadSafeSingleton.showMessage();


    }
}
