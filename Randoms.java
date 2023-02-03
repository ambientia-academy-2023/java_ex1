import java.util.Random;

public class Randoms {
    
    public static void main(String[] args) {
        Random randNum=new Random();
        for(int x=1; x<=10; x++){
            
            int rm=randNum.nextInt(3);
            System.out.println("Luku = "+rm);
        }

      }  
}
