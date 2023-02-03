import java.io.Console;

/* Kirjoita ohjelma joka kysyy kaksi kokonaislukua ja laskee ja tulostaa niiden summan. 
 Selvitä kuinka IntParse toimii Javassa
*/

public class CalcSum {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna luku 1");
        String str1 = c.readLine();
        System.out.println("Anna luku 2");
        String str2 = c.readLine();
        try {
            int nr1 = Integer.parseInt(str1);
            int nr2 = Integer.parseInt(str2);
            int sum = nr1 + nr2;
            System.out.println("Summa: " + sum);
            if (nr1 > nr2) {
                System.out.println(nr1 + " on suurempi");
            } else {
                System.out.println(nr2 + " on suurempi");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Annoitko kokonaisluvut");
        }


    }
}
