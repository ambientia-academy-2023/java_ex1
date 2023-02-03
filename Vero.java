import java.io.Console;

/*
 * Sovellus kysyy bruttotulon ja laskee valtionveron määrän
 * ja käteen jäävän summan
 * Verotaulukko löytyy sivulta https://www.veronmaksajat.fi/Palkka-ja-elake/Valtion-tulovero/valtion-tuloveroasteikko-2023/#0367e30f
 */
public class Vero {
    public static void main(String[] args) {
        System.out.println("Anna bruttotulosi");
        float brutto=0;
        Console c=System.console();
        try {
            brutto=Float.parseFloat(c.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("%.2f",brutto));
      }  
}
