import java.io.Console;

public class SayHello {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna nimesi");
        String fname = c.readLine();
        System.out.println("Terve " + fname);
    }
}
