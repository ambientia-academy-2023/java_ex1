import java.io.Console;

/*
 * Sovellus kysyy bruttotulon ja laskee valtionveron määrän
 * ja käteen jäävän summan
 * Verotaulukko löytyy sivulta https://www.veronmaksajat.fi/Palkka-ja-elake/Valtion-tulovero/valtion-tuloveroasteikko-2023/#0367e30f
 */
public class Vero {
    public static void main(String[] args) {

        float taxes = 0;
        float brutto = 0;
        while (brutto != -1){
            brutto = askBrutto();
            if (brutto < 0) {
                System.out.println("Tulo ei voi olla negatiivinen");
            } else {
                taxes = calculateTaxes(brutto);
                System.out.println("Vero=" + String.format("%.2f", taxes));
                System.out.println("Netto=" + String.format("%.2f", brutto - taxes));
    
            }
        }

    }

    private static float askBrutto() {
        System.out.println("Anna bruttotulosi");
        System.out.println("Anna -1 lopettaaksesi");
        float br = 0;
        Console c = System.console();
        try {
            br = Float.parseFloat(c.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return br;

    }

    private static float calculateTaxes(float brutto) {
        if (brutto < 19900) {
            return (float) (0.1264 * brutto);
        } else if (brutto < 29700) {
            return (float) (2515.36 + 0.19 * (brutto - 19900));
        } else if (brutto < 49000) {
            return (float) (4377.36 + 0.3025 * (brutto - 29799));
        } else if (brutto < 85800) {
            return (float) (10215.61 + 0.34 * (brutto - 49000));
        } else {
            return (float) (22727.61 + 0.44 * (brutto - 85800));
        }
    }
}
