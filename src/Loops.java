import java.util.*;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {return brugere;}

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        for (String i : brugere)
            System.out.println(i);
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */

    public void printBrugereReverseArr() {
        List<String> brugerBagfra = Arrays.asList(brugere);
        Collections.reverse(brugerBagfra);
        String[] reversed = brugerBagfra.toArray(brugere);
        System.out.println(Arrays.toString(reversed));

    }

    public void waitingFor0() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(i !=0) {
            System.out.println("Venter på 0! " + "Skriv et tal...");
           i = input.nextInt();
        }
 
    }
}
