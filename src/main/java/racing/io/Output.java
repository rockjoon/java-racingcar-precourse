package racing.io;


public class Output {

    public static void print(ConsoleMessage message) {
        System.out.println(message.message());
    }

    public static void print(String message) {
        System.out.println(message);
    }

}
