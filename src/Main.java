public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = number -> System.err.println("Task " + number + " is canceled");
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}
