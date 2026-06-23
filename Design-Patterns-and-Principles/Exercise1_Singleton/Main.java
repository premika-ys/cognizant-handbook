package Exercise1_Singleton;

public class Main {

    public static void main(String[] args) {

        // Getting Logger instance
        Logger logger1 = Logger.getInstance();

        // Logging message
        logger1.log("Application Started");

        // Getting Logger instance again
        Logger logger2 = Logger.getInstance();

        // Logging another message
        logger2.log("User Logged In");

        // Checking whether both references point to same object
        if (logger1 == logger2) {
            System.out.println("Same Logger Instance");
        } else {
            System.out.println("Different Logger Instances");
        }
    }
}
