/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {
    // TODO Din kode her
    public static void main(String[] args) {
        // Her er en kommentar, jeg blev ret stresset tilsidst og når desværre ikke at kommentere alt min kode.
        System.out.println("Hello world!");
        hello("András");
        hello("");
    }

    public static String hello(String navn) {
        if (navn == "") {
            return "Hello World!";
        } else return "Hello " + navn + "!";
    }
}