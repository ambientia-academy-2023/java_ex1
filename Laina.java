import java.io.Console;

/*
 * Tee ohjelma, joka kysyy käyttäjältä lainan summan, kuukausittaisen lyhennyssumman ja korkoprosentin. Ohjelma tulostaa näytölle lainanhoitosuunnitelman, eli jokaiselta kuukaudelta lyhennyksen suuruuden, maksetun koron ja jäljellä olevan lainasumman. Kuukaudessa on 30 korkopäivää. Lainaa lyhennetään kuukausittain lyhennyssumman verran ja samalla maksetaan kyseisenä kuukautena kertyneet lainan korot. Käytössä on siis tasalyhennys.
 */
public class Laina {
    public static void main(String[] args) {
        float p=0;
        float fmonths=0;
        int months=0;
        float lyh=0;
        float vpros;
        float korko=0;
        Console c=System.console();
        System.out.println("Anna lainapääoma");
        p=Float.parseFloat(c.readLine());
        System.out.println("Anna lyhennyserän suuruus");
        lyh=Float.parseFloat(c.readLine());
        System.out.println("Anna korkoprosentti (vuosikorko)");
        vpros=Float.parseFloat(c.readLine());
        fmonths=(float)p/(float)lyh;
        months=(int) Math.floor(fmonths);
        System.out.println(months);
        float j=0;
        for(int x=1; x<=months; x++){
            j=p-(x*lyh);
            korko=(p-(x-1)*lyh)*(vpros/1200);
            System.out.print(x+1+".Lyhennys= "+lyh);
            System.out.print(" Korko="+korko);
            System.out.print(" Pääomaa jäljellä="+j);
            System.out.println();
        }
      } 
}
