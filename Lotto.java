import java.lang.reflect.Array;
/* 
 * Arvo, luku ja aseta numbers-taulukossa 1 kyseisen indeksin kohdalle
 * Jos indeksin kohdalla on jo 1 arvo uudestaan
 * lopuksi tulosta indeksit joiden kohdalla on 1.
*/
import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int numbers[]=new int[41];
        //Arrays.fill(numbers,0);
        Random randNum=new Random();
        int rm;
        //arvotaan 7 numeroa
        for(int x=1; x<=7; x++){
            rm=randNum.nextInt(40)+1;
            //jos taulukossa on saadun numeron kohdalla 1
            //arvotaan uudestaan
            while(numbers[rm]==1){
                rm=randNum.nextInt(40)+1; 
            }
            numbers[rm]=1;
        }
        for(int x=1; x<=40; x++){
            //System.out.print(numbers[x]+",");
        }
        for(int x=1; x<=40; x++){
            if(numbers[x]==1){
                System.out.print(x+" , ");
            }
        }
      }  
}
